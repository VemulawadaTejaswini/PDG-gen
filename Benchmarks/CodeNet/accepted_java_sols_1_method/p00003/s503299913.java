import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            double[] triangle = new double[3];
            triangle[0] = sc.nextDouble();
            triangle[1] = sc.nextDouble();
            triangle[2] = sc.nextDouble();
            double a = Math.pow(triangle[0], 2);
            double b = Math.pow(triangle[1], 2);
            double c = Math.pow(triangle[2], 2);
            if (a + b == c || b + c == a || a + c == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            num = num - 1;

        }
    }
}

