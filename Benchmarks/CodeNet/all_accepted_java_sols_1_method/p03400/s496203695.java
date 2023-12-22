import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int d = Integer.parseInt(scanner.next());
        int x = Integer.parseInt(scanner.next());
        int answer = x;

        for (int i = 1;i <= n;i++) {
            int a = Integer.parseInt(scanner.next());
            answer += 1;
            for (int j = 1;j <= d;j++) {
                if ((j*a+1) <= d) {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}