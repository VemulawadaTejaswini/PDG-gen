import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int H = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        double Hdeg = H * 30 + M * 0.5;
        double Mdeg = M * 6;

        double deg = Hdeg - Mdeg;
        if (deg > 180) {
            deg = 360 - deg;
        }
        deg = Math.abs(deg);

        double cSquare = A * A + B * B - (2 * A * B * Math.cos(deg * Math.PI / 180));
        System.out.println(Math.sqrt(cSquare));
    }
}
