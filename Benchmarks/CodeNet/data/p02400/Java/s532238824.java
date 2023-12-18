import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double s = r*r*Math.PI;
        double c = Math.PI;
        System.out.printf("%f %f", s, c);
    }
}

