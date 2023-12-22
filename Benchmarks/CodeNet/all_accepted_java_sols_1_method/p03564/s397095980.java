import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        int ans = 1;
        
        while(n>0)
        {
            ans = Math.min(ans+k,2*ans);
            n--;
        }
        System.out.println(ans);
    }
}