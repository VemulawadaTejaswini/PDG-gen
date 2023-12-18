import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/08.
 */

public class Main {
    public static void main(String args[]) {
        int payment, sum, change;
        int money[] = {10, 50, 100, 500};
        int money_number[] = new int[4];
        int answer[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int count = 0; ; count++){
            payment = sc.nextInt();
            if(payment == 0) break;
            sum = 0;
            for(int i = 0; i < 4; i++) {
                money_number[i] = sc.nextInt();
                answer[i] = 0;
                sum += money[i] * money_number[i];
            }
            change = sum - payment;
            while(change / 500 > 0){
                answer[3]++;
                change -= 500;
            }
            while(change / 100 > 0){
                answer[2]++;
                change -= 100;
            }
            while(change / 50 > 0){
                answer[1]++;
                change -= 50;
            }
            while(change / 10 > 0){
                answer[0]++;
                change -= 10;
            }
            if(count > 0) System.out.println();
            for(int i = 0; i < 4; i++) {
                if(money_number[i] - answer[i] >= 0) money_number[i] -= answer[i];
                if(money_number[i] != 0) System.out.println(money[i] + " " + money_number[i]);
            }
        }
    }
}