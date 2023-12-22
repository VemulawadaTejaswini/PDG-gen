import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            int temp = i;
            int ans = 0;
            while (temp > 0) {
                ans += temp % 10;
                temp /= 10;
            }
            if (ans >= A && ans <= B) {
                count += i;
            }
        }
        System.out.println(count);
    }
}
