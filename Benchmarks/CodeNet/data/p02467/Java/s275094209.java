import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(n).append(":");
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                ans.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            ans.add(n);
        }
        for (int x : ans) {
            sb.append(" ").append(x);
        }
        System.out.println(sb);
     }
}
