import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        int[] t = new int[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
            t[i] = Integer.parseInt(sc.next());
        }
        String x = sc.next();
        
        boolean b = false;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(b) ans += t[i];
            if(s[i].equals(x)) b = true;
        }
        
        System.out.println(ans);
    }
}