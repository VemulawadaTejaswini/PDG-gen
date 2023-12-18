import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] a = new int[3];
            int[] b = new int[3];
            for (int j = 0; j < a.length; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < b.length; j++) {
                b[j] = scanner.nextInt();
            }
            int x = a[0] * 3600 + a[1] * 60 + a[2];
            int y = b[0] * 3600 + b[1] * 60 + b[2];
            int t = y - x;
            int h = t / 3600;
            int m = t % 3600 / 60;
            int s = t % 3600 % 60;
            System.out.println(h + " " + m + " " + s);
        }
    }
}
