
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ");
        int A = Integer.parseInt(lines[0]);
        int B = Integer.parseInt(lines[1]);
        int H = Integer.parseInt(lines[2]);
        int M = Integer.parseInt(lines[3]);

        double radianChoshin = 6 * M;
        double radianTanshin = 30 * H + 0.5 * M;
        double radian = Math.abs(radianChoshin - radianTanshin);

//        System.out.println(radianChoshin);
//        System.out.println(radianTanshin);
//        System.out.println(radian);
//        System.out.println(M);
        double ans = Math.sqrt(A*A + B*B-2*A*B*Math.cos(Math.toRadians(radian)));
        System.out.println(ans);
    }
}
