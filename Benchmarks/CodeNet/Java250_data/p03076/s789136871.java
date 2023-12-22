

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int[] round = new int[5];
        int tempMin = 9;
        int index = -1;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            round[i] = (int) (Math.ceil((float) num / 10) * 10);
            if ((num % 10) <= (tempMin % 10) && num % 10 > 0) {
                tempMin = num;
                index = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (i != index) {
                sum += round[i];
            }
        }
        if (index >= 0) {
            sum += tempMin;
        }
        System.out.println(sum);
    }
}
