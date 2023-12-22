import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int temp = 0;
        for (int i = 9; i >= 0; i--) {
            if (n % i == 0) {
                temp = n / i;
                break;
            }
        }
        for (int i = 9; i >= 0; i--) {
            if (temp % i == 0) {
                temp = temp / i;
                break;
            }
        }
        if (temp == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}