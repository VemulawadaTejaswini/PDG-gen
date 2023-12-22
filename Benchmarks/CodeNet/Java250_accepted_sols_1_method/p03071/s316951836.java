import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          int sum = 0;
          for(int i = 0; i < 2; i++){
            if(num1 < num2){
              sum += num2;
              num2--;
            } else {
              sum += num1;
              num1--;
            }
          }
          System.out.println(sum);
      }
    }