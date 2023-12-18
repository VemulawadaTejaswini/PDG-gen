import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            while (n != 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                int f = sc.nextInt();
                int g = sc.nextInt();
                int h = sc.nextInt();
                int x = a * e - b * f - c * g - d * h;
                int y = a * f + b * e + c * h - d * g;
                int z = a * g - b * h + e * c + d * f;
                int w = a * h + b * g - c * f + d * e;
                System.out.println(x + " " + y + " " + z + " " + w);
                n--;
            }
        }
    }
}