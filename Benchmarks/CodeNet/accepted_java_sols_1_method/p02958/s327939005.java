import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        String ans = "YES";
        for (int i = 1; i <= N; i++) {
            int a = in.nextInt();
            if (i != a) {
                count++;
            }
            if (count > 2) {
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);
    }
}
