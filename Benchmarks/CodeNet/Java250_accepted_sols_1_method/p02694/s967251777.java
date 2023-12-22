import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        long money = 100;
        long cou = 0;
        while(money<X){
        money = money/100 + money;
            cou++;
        }
                System.out.println(cou);
        }
}
