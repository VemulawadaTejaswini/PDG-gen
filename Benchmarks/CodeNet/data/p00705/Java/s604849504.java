import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static int DAY_MAX = 100;

    public static void main(String[] args) {
        while (true) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();
            if (N == 0 && Q == 0) return;

            int[] calendar = new int[DAY_MAX];
            for (int n = 0; n < N; n++) {
                int M = scanner.nextInt();

                for (int m = 0; m < M; m++) {
                    int date = scanner.nextInt();
                    calendar[date] += 1;
                }
            }

            int maxAttendee = -1;
            int heldDay = -1;
            for (int day = 0; day < DAY_MAX; day++) {
                int attendee = calendar[day];

                if (attendee > maxAttendee) {
                    maxAttendee = attendee;
                    heldDay = day;
                }
            }

            System.out.println(maxAttendee >= Q ? heldDay : 0);
        }
    }

}

