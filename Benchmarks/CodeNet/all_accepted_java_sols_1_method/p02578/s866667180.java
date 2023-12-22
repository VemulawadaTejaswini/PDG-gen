import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        
        int max = Integer.parseInt(sc.next());
        long ans = 0;
        for(int i = 0; i < n-1; i++){
            int a = Integer.parseInt(sc.next());
            ans += Math.max(max - a, 0);
            max = Math.max(a, max);
        }
        System.out.println(ans);
    }
}