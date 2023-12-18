import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int h = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        scan.close();

        double rad = Math.abs((double)(h * 60 + m) / 720 - (double)m / 60) * Math.PI * 2;

        double ans2 = a * a + b * b - 2 * a * b * Math.cos(rad);

            System.out.println(Math.sqrt(ans2));
       
    }

}