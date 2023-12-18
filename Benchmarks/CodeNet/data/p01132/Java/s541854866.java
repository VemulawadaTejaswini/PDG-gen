import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/08.
 */

public class Main {
    public static void main(String args[]) {
        int payment, sum, change, i;
        int money[] = {10, 50, 100, 500};
        int money_number[] = new int[4];
        int change_number[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int count = 0; ; count++){
            payment = sc.nextInt();
            if(payment == 0) break;
            sum = 0;
            for(i = 0; i < 4; i++) {
                money_number[i] = sc.nextInt();
                change_number[i] = 0;
                sum += money[i] * money_number[i];
            }
            change = sum - payment;
            for(i = 3; i >= 0; i--) if(money_number[i] > 0) break;
            for(; i >= 0; i--){
                if(money_number[i] == 0) break;
                for(int j = 0; j < money_number[i] && change / money[i] > 0; j++){
                    change_number[i]++;
                    change -= money[i];
                }
            }
            //for(int tmp: change_number) System.out.println(tmp);
            if(count > 0) System.out.println();
            for(i = 0; i < 4; i++) {
                money_number[i] -= change_number[i];
                if(money_number[i] > 0) System.out.println(money[i] + " " + money_number[i]);
            }
        }
    }
}