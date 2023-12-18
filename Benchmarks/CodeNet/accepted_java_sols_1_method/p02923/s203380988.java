import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = -1, tmp = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int h = Integer.parseInt(sc.next());
            sum = tmp >= h ? sum + 1 : 0;
            tmp = h;
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}
