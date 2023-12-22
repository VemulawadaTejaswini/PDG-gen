import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = -1;
        for (int i = 1000; i > 0; i--) {
            double a = i * 0.08;
            double b = i * 0.1;
            if (Math.floor(a) == A && Math.floor(b) == B) {
                result = i;
            }
        }
        System.out.println(result);
    }

}
