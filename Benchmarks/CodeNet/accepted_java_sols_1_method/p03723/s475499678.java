import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        for (int i = 0 ; i < 1000 ; i++) {
            if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                count++;
                int temp1 = b/2 + c/2;
                int temp2 = c/2 + a/2;
                int temp3 = a/2 + b/2;
                a = temp1;
                b = temp2;
                c = temp3;
            } else {
                System.out.println(count);
                return;
            }
        }
        System.out.println(-1);
    }

}
