import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        int start = Math.max(a,c);
        int end = Math.min(b,d);
        
        int ans = end - start;
        if(ans>0)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println(0);
        }
    }
}