import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++){
            p[i] = input.nextInt();
        }
        Arrays.sort(p);
        int ans = 0;
        for (int i = 0; i < k; i++){
            ans += p[i];
        }
        System.out.println(ans);
    }
}