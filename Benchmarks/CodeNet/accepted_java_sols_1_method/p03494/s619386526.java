import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberCount = sc.nextInt();
        int divisionTimes = 0;
        int minDivision = 1000000001;

        for (int i = 0; i < numberCount; i++) {
            int divisionNumber = sc.nextInt();
            while(divisionNumber % 2 == 0) {
               divisionNumber /= 2;
               divisionTimes += 1;
            }
            if(divisionTimes < minDivision) minDivision = divisionTimes;
            divisionTimes = 0;
        }
        System.out.println(minDivision);
    }
}
