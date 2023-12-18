import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i=0;i<n;i++){
            ans = Math.min(ans*2,ans+k);
        }
        System.out.println(ans);
    }
}
