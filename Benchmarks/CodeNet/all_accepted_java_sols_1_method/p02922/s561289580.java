import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int total = num1;
      int count = 1;
      if(num2 > 1){
      while(total < num2){
        total = (num1 - 1) + total;
        count++;
      } 
      } else {
        count = 0;
      }

      System.out.print(count);
    }
}
