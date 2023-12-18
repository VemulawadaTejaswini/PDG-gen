import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            ans[scanner.nextInt()-1]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);;
        }
    }
}
