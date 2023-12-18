import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        for (int i = n; i > 0; i--) {
            int sqrt = (int) Math.sqrt(i);
            int pow = (int) Math.pow(sqrt, 2);
            if (i == pow) {
                System.out.println(i);
                return;
            }
        }
    }
}