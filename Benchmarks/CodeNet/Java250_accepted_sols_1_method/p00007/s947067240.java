import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int money = 100;
                for (int i = 0; i < n; i++){
                        double x = (double)money * 1.05;
                        money = (int)(Math.ceil(x));
                }
                System.out.println(money * 1000);
        }
}