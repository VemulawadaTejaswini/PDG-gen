import java.util.Scanner;

class Main {
    private static final int[] DATE = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31,
            30, 31};

    private static final String[] DAY_OF_THE_WEEK = {"Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                int month = sc.nextInt();
                int day = sc.nextInt();
                if (month == 0 || day == 0) {
                    break;
                }

                System.out.println(getDayOfTheWeek(month, day));

            }
        } finally {
            sc.close();
        }
    }

    private static String getDayOfTheWeek(int m, int d) {
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += DATE[i];
        }
        sum += d;
        return DAY_OF_THE_WEEK[sum % 7];
    }
}