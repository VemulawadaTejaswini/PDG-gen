import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            String score = "A";

            int sum = m + f;
            if (m + f + r == -3) {
                return;
            } else if (m * f < 0) {
                score = "F";
            } else if (sum < 30) {
                score = "F";
            } else if (sum < 50) {
                score = r < 50 ? "D" : "C";
            } else if (sum < 65) {
                score = "C";
            } else if (sum < 80) {
                score = "B";
            }

            System.out.println(score);
        }
    }
}
