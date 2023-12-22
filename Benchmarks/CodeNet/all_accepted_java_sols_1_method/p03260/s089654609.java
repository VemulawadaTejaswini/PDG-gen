import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i < 4; i++) {
            int tmp = a * b * i;
            if(tmp % 2 == 1) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}