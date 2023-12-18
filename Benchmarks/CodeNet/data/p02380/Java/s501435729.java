import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int degree = scan.nextInt();

        System.out.println(0.5 * a * b * Math.sin(Math.toRadians(degree))); // 面積
        System.out.println(a + b + Math.sqrt(((Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(degree))))));
        System.out.println(b * Math.sin(Math.toRadians(degree)));
    }
}