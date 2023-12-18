import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/08.
 */

public class Main {
    public static void main(String args[]) {
        int payment, sum, surplus;
        int money[] = {10, 50, 100, 500};
        int money_number[] = new int[4];
        int answer[] = new int[4];
        Scanner sc = new Scanner(System.in);
        while (true) {
            payment = sc.nextInt();
            if(payment ==  0) break;
            sum = 0;
            for(int i = 0; i < 4; i++)  money_number[i]= sc.nextInt();
            for(int i = 0; i < 4; i++)  answer[i]= 0;
            for(int i = 0; i < 4; i++) sum += money[i] * money_number[i];
            surplus = sum - payment;
            while(surplus / 500 > 0){
                answer[3]++;
                surplus -= 500;
            }
            while(surplus / 100 > 0){
                answer[2]++;
                surplus -= 100;
            }
            while(surplus / 50 > 0){
                answer[1]++;
                surplus -= 50;
            }
            while(surplus / 10 > 0){
                answer[0]++;
                surplus -= 10;
            }
            for(int i = 0; i < 4; i++) {

                if(money_number[i] - answer[i] >= 0) money_number[i] -= answer[i];
                if(money_number[i] != 0) System.out.println(money[i] + " " + money_number[i]);
            }
        }
    }
}