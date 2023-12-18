
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1;i<=n;i++){
            map.put(i, 0);
        }
        for(int i=0;i<k;i++){
            int d = sc.nextInt();
            for(int j=0;j<d;j++){
                int a = sc.nextInt();
                map.put(a, 1);
            }
        }
        sc.close();
        for(int ans : map.values()){
            if(ans == 0){
                sum++;
            }
        }
        System.out.println(sum); 
    }
}