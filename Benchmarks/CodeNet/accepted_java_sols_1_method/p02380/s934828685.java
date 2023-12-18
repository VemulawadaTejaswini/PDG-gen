import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a, b, c;
        double s, l, h;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        h = b * Math.sin(Math.toRadians(c));
        s = a * h / 2;
        l = a + b + Math.sqrt((a - b*Math.cos(Math.toRadians(c))) * (a - b*Math.cos(Math.toRadians(c))) + h * h);
        System.out.printf("%f\n%f\n%f\n", s, l, h);
    }
}
