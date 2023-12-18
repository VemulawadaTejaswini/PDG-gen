
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if (m == -1 && f == -1 && r == -1)
                break;
            String grade = "";
            int sum = m + f;
            if (m == -1 || f == -1)
                grade = "F";
            else if (sum >= 80)
                grade = "A";
            else if (sum >= 65 && sum < 80)
                grade = "B";
            else if (sum >= 50 && sum < 65)
                grade = "C";
            else if (sum >= 30 && sum < 50){
                if (r >= 50){
                    grade = "C";
                } else {
                    grade = "D";
                }
            } else {
                grade = "F";
            }
                System.out.println(grade);
        }
    }
}

