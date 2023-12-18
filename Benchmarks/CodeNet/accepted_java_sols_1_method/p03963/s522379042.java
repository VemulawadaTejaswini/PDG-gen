import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = m;
        for(int i=0;i<n-1;i++)
            ans*=(m-1);
        System.out.println(ans);
    }
}
