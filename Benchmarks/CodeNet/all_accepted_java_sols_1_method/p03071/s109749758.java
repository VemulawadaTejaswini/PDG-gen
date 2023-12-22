import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();
        int ans = n+b;
        int ans1 = n+n-1;
        int ans2 = b+b-1;
        System.out.println(Math.max(ans,Math.max(ans1,ans2)));
    }
}
