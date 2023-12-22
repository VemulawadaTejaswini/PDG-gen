import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = Integer.parseInt(sc.next());
        }
        
        int ans = 0;
        for(int a = 0; a < n-1; a++){
            for(int b = 0; b < n-1-a; b++){
                ans += d[a] * d[a+1+b];
            }
        }
        
        System.out.println(ans);
    }
}