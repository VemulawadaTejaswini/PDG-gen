import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int a = Integer.parseInt(sc.next());
            if(i%2 == 1 && a%2 == 1) ans++;
        }
        System.out.println(ans);
    }
}