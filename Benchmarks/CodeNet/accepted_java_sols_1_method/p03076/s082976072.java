import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int minus = 10;
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            if(num % 10 > 0 && num % 10 < minus){
                minus = num %  10;
            }
            num += num % 10 == 0 ? 0 : 10 - (num % 10);
            total += num;
        }
        total -= (10 - minus);
        System.out.println(total);
    }
}
