import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int min = 10000;
        int total = 0;
        int mind = 1;
        for(int i = 1; i <= N; i++){
            int num = (i + L - 1);
            total += num;
            int mindd = num < 0 ? -1 : 1;
            num = num < 0 ? -1 * num : num;
            if(min > num){
                min = num;
                mind = mindd;
            }
        }
        System.out.println(total - (mind * min));
    }
}
