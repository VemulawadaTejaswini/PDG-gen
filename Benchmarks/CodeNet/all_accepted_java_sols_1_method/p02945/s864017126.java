import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            int minus = num1 - num2;
            int multi = num1 * num2;
            if(sum >= minus && sum >= multi){
              System.out.println(sum);
            } else if(minus >= sum && minus >= multi){
              System.out.println(minus);
            } else {
              System.out.println(multi);
            }
      }
}