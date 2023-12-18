import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = Integer.parseInt(sc.next());
        }
        
        if(k >= n){
            System.out.println(0);
        }else{
            Arrays.sort(h);
            long ans = 0;
            for(int i = 0; i < n-k; i++){
                ans += h[i];
            }
            System.out.println(ans);
        }
    }
}