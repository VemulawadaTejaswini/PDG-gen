import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int ans = 1;
        int count = 0;
        for (int i=0;i<n;i++) {
            count+=sc.nextInt();
            if (count<=x)ans++;
        }
        System.out.println(ans);
    }
}
