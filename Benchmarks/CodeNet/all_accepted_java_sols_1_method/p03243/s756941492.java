import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 9; i >= 0; i--) {
            if (num > i * 111) {
                System.out.println((i + 1)*111);
                break;
            }
        }
    }
}
