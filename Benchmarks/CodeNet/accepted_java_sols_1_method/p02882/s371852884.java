import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double area = (1.0 * x) / (1.0 * a);
        sc.close();
        if (a * b / 2 >= area) {
            // 三角形
            double len = 2 * area / b;
            double tan = b / len;
            double ans = Math.atan(tan);
            double answer = ans / Math.PI * 180;
            System.out.println(answer);
        } else {
            double len = (area * 2 / a) - b;
            double tan = (b - len) / a;
            double ans = Math.atan(tan);
            double answer = ans / Math.PI * 180;
            System.out.println(answer);
        }
    }
}
