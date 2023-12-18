import java.util.Scanner;

class Main {
    private void rightTriangle() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            float x = (float)(c * e - b * f) / (a * e - b * d);
            float y = (float)(c * d - a * f) / (b * d - a * e);
            System.out.println(String.format("%.3f %.3f",
                                             x == 0 ? 0 : x ,
                                             y == 0 ? 0 : y));
        }
    }

    public static void main(String[] args) {
        (new Main()).rightTriangle();
    }
}