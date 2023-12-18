import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();

            int sum = m + f;

            String grade = "F";

            if (m == -1 && f == -1 && r == -1) {
                break;
            }

            if (m == -1 || f == -1) {
                grade = "F";
            } else if (sum >= 80) {
                grade = "A";
            } else if (sum >= 65) {
                grade = "B";
            } else if (sum >= 50) {
                grade = "C";
            } else if (sum >= 30) {
                if (r >= 50) {
                    grade = "C";
                } else {
                    grade = "D";
                }
            } else {
                grade = "F";
            }

            System.out.println(grade);
        }

        sc.close();

    }
}
