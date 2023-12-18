import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int ij = 0;
        int xy = 0;
        int mapin = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                ij = j - i;
                xy = Math.abs(y - j) + Math.abs(x - i) + 1;
                if(ij<xy){
                    mapin = ij;
                }else{
                    mapin = xy;
                }
                if(map.containsKey(mapin)){
                    int value = map.get(mapin) + 1;
                    map.replace(mapin, value);
                }else{
                    map.put(mapin,1);
                }
            }
        }
        for(int i=1;i<n;i++){
            if(map.containsKey(i)){
                System.out.println(map.get(i));
            }else{
                System.out.println(0);
            }
        }
    }
}

