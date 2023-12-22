import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans;
        if(k <= a)
        	ans = k;
        else if(k <= (a + b))
        	ans = a;
        else {
        	ans = a - (k - (a + b));
        }
        System.out.println(ans);
    }
}