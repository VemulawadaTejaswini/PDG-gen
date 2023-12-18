import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            double x1 = Double.parseDouble(sc.next());
            double y1 = Double.parseDouble(sc.next());
            double r1 = Double.parseDouble(sc.next());

            double x2 = Double.parseDouble(sc.next());
            double y2 = Double.parseDouble(sc.next());
            double r2 = Double.parseDouble(sc.next());

            double xy = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double rs = r1 + r2;
            double rd = r1 - r2;

            if (xy > rs) {
                System.out.println("0");
            } else if (Math.abs(rd) <= xy && xy <= rs) {
                System.out.println("1");
            } else if (rd > 0) {
                System.out.println("2");
            } else {
                System.out.println("-2");
            }
        }
    }
}