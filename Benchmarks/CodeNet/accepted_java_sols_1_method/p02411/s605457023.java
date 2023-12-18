import java.util.Scanner;

/**
 * Structured Program II
 */
public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        // 中間試験の点数 m、期末試験の点数 f、再試験の点数 r
        int m,f,r, sum;
        String seiseki = "";
        while (true) {
            m = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            sum = m + f;
            if (m == -1 && f == -1) {
                return;
            } else if (m < 0 || f < 0) {
                seiseki = "F";
            } else if (sum >= 80) {
                seiseki = "A";
            } else if (sum >= 65 && sum < 80) {
                seiseki = "B";
            } else if (sum >= 50 && sum < 65) {
                seiseki = "C";
            } else if (sum >= 30 && sum < 50) {
                seiseki = "D";
                if (r >= 50) {
                    seiseki = "C";
                }
            } else if (sum < 30) {
                seiseki = "F";
            }
            System.out.println(seiseki);
        }
    }
}