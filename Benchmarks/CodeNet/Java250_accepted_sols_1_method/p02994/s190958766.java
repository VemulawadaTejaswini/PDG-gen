import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if (a + b >= 0 && b >= 0) {
            for (int i = 0; i < a - 1; i++) {
                sum += b + 1 + i;
            }
        }
        if (a + b > 0 && b < 0) {
            for (int i = 0; i < a; i++) {
                sum += b + (i);
            }
        }
        if (a + b <= 0 && b < 0) {
            for (int i = 0; i < a - 1; i++) {
                sum += b + (i);
            }
        }
        System.out.println(sum);
    }
}