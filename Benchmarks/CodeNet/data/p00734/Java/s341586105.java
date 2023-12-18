import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if(line.equals("0 0")) {
                return;
            }

            int countCard1 = Integer.valueOf(line.split(" ")[0]);
            int countCard2 = Integer.valueOf(line.split(" ")[1]);

            int[] arrCard1 = new int[countCard1];
            int[] arrCard2 = new int[countCard2];

            int totalVal1 = 0;
            int totalVal2 = 0;
            for (int i = 0; i < countCard1; i++) {
                arrCard1[i] = Integer.valueOf(sc.nextLine());
                totalVal1 += arrCard1[i];
            }

            for (int i = 0; i < countCard2; i++) {
                arrCard2[i] = Integer.valueOf(sc.nextLine());
                totalVal2 += arrCard2[i];
            }

            if ((totalVal1 + totalVal2) % 2 != 0) {
                System.out.println("-1");
            } else {
                int avg = (totalVal1 + totalVal2) / 2;
                int missingValue1 = avg - totalVal1;

                String result = null;
                Integer minResult = null;

                for (Integer number1 : arrCard1) {
                    for (Integer number2 : arrCard2) {
                        if(number1 + missingValue1 == number2) {
                            if(minResult == null || number1 + number2 < minResult) {
                                result = number1 + " " + number2;
                                minResult = number1 + number2;
                            }
                        }
                    }
                }

                if(result == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(result);
                }
            }
        }


    }

}

