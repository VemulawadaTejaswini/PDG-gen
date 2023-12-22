import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean flag = false;
        while (N > 0) {
            int temp = N % 10;
            N /= 10;
            if (temp == 7)
                flag = true;
        }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
