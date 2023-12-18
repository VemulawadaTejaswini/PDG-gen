import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] p = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = sc.nextInt();
        }
        int ans = 0;
        Arrays.sort(p);
        for(int i = 0;i<k;i++){
            ans += p[i];
        }
        System.out.println(ans);
    }
}
