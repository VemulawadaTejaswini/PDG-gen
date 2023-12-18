import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double med = (a + b) / 2.0;
            if (a + b >= 360) {
                med -= 180;
            }
            System.out.println(med);
        }
    }
}