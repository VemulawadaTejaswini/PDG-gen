import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp % 2 != 0) continue;
            while (temp % 2 == 0 && temp != 0) {
                temp /= 2;
                count ++;
            }
        }
        System.out.println(count);
    }
}
