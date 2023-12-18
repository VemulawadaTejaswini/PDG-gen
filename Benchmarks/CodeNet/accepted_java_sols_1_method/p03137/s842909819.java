import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        if(n >= m){
            System.out.println(0);
            return;
        }
        int[] x = new int[m];
        for(int i = 0; i < m; i++){
            x[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(x);
        
        int[] x2 = new int[m-1];
        for(int i = 0; i < m-1; i++){
            x2[i] = x[i+1] - x[i];
        }
        Arrays.sort(x2);
        
        int ans = 0;
        for(int i = 0; i < m-n; i++){
            ans += x2[i];
        }
        
        System.out.println(ans);
    }
}