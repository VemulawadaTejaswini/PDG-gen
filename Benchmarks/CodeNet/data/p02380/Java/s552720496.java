public class Main {
    public static void main(String[] args) {
 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double C = sc.nextDouble();

         double h = b * Math.sin(Math.toRadians(C));
        double S = 0.5 * h * a;
        double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
        System.out.println(String.format("%10.8f", S));
        System.out.println(String.format("%10.8f", L));
        System.out.println(String.format("%10.8f", h));
    }
}