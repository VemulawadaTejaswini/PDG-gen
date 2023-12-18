import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double rad = Math.toRadians(scan.nextDouble());
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(rad));

        double area = a*b*Math.sin(rad)/2.0;
        double perimeter = a + b + c;
        double h = 2*area / a;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(h);
    }
}