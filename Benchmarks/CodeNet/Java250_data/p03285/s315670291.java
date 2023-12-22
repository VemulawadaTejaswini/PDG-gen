import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < 15; i++) {
            if (N % 4 == 0) {
                System.out.println("Yes");
                break;
            }
            N -= 7;
            if (N < 0) {
                System.out.println("No");
                break;
            }
        }
    }
}