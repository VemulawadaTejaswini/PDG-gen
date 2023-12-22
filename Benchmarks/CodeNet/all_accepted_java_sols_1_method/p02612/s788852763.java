import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        int money = 0;
        while(money < N){
            money = money + 1000;
        }
        System.out.println(money-N);
    }
}