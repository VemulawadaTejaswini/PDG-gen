import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int millennium = getNumberOfDates(1000, 1, 1);
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();
        for(int i = 1; i < line; i++) {
            int year = s.nextInt();
            int month = s.nextInt();
            int date = s.nextInt();
            System.out.println(millennium - getNumberOfDates(year, month, date));
        }
    }


    private static int getNumberOfDates(int year, int month, int date) {
        int numberOfDates = 0;
        for (int i = 0; i < year; i++) {
            int datesInOddMonth = 20;
            int datesInEvenMonth = 19;

            if (i % 3 == 0) {
                datesInEvenMonth = 20;
            }

            numberOfDates += (datesInOddMonth + datesInEvenMonth) * 5;
        }

        for (int j = 1; j < month; j++) {
            if(year % 3 ==0){
                numberOfDates += 20;
            } else if (j % 2 == 0) {
                numberOfDates += 19;
            } else {
                numberOfDates += 20;
            }
        }

        return numberOfDates + date;
    }
}