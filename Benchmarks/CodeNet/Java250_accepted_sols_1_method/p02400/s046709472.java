import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("%f %f\n", Math.pow(r, 2) * Math.PI, r * 2 * Math.PI);
        sc.close();
    }
}

