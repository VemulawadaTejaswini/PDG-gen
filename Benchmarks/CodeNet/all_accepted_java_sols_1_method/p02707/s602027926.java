import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
           map.put(i,0);
        }
        for(int i=0;i<n-1;i++){
            int an = sc.nextInt();
            int va = map.get(an);
            map.replace(an, va + 1);
        }
        for(int i=1;i<=n;i++){
            System.out.println(map.get(i));
        }
        sc.close();
    }
}