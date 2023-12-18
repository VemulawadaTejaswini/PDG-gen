import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lineCount = 1;
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(" ");
            int fromYear = Integer.parseInt(line[0]);
            int toYear = Integer.parseInt(line[1]);

            // ??\???????????¨??????0??§????????´?????????????????????
            if (fromYear == 0 && toYear == 0) {
                break;
            }

            if (lineCount++ != 1) {
                System.out.println("");
            }

            int leapCount = 0;
            for (int year = fromYear; year <= toYear; year++) {
                if (isLeapYear(year)) {
                    System.out.println(year);
                    leapCount++;
                }
            }

            if (leapCount == 0) {
                System.out.println("NA");
            }

        }
        sc.close();
    }

    /**
     * ?????°??????????????´???????????????????????????
     */
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;

    }
}