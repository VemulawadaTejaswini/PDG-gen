import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double C = Math.toRadians((sc.nextInt()));
        double c = Math.sqrt(a * a + b * b - 2 * Math.cos(C) * a * b);
        double S = a * b * Math.sin(C) / 2;

        System.out.println(S);
        System.out.println(a + b + c);
        System.out.println(S * 2 / a);
    }
}