
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vacationDays = scanner.nextInt();
        int noOfAssignments = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < noOfAssignments; i++) {
            sum += scanner.nextInt();
        }
        if (vacationDays >= sum) {
            System.out.println(vacationDays - sum);
        } else {
            System.out.println(-1);
        }

    }
}
