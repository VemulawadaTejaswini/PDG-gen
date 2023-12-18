import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        boolean[] b = new boolean[n+1];
        for(int i = 0; i < k; i++){
            int d = Integer.parseInt(sc.next());
            for(int j = 0; j < d; j++){
                b[Integer.parseInt(sc.next())] = true;
            }
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(!b[i]) ans++;
        }
        System.out.println(ans);
    }
}