import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int sumans = 0;
        int check = 0;
        for(int i = 1; i <= n; i++){
            check = i;
            while(check >= 1){
                sum = sum + check%10;
                check = check / 10;
            }
            if(a <= sum && sum <= b){
                sumans = sumans + i;
            }
            sum = 0;
        }
        System.out.print(sumans);
    }
}