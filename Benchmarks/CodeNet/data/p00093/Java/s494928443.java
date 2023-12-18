import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // check line number to insert new line
        int lineCount = 1;
        while (sc.hasNextLine()) {

            // input
            String[] line = sc.nextLine().split(" ");
            int fromYear = Integer.parseInt(line[0]);
            int toYear = Integer.parseInt(line[1]);

            // input:both fromYear and toYear are zero, process end
            if (fromYear == 0 && toYear == 0) {
                break;
            }

            // insert new line
            if (lineCount++ != 1) {
                System.out.println();
            }

            int leapCount = 0;
            // judge leap year. then print the year
            for (int year = fromYear; year <= toYear; year++) {
                if (isLeapYear(year)) {
                    System.out.println(year);
                    leapCount++;
                }
            }

            // case non leap year, print "NA"
            if (leapCount == 0) {
                System.out.println("NA");
            }

        }
        sc.close();
    }

    /**
     * check argument whether leap year
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