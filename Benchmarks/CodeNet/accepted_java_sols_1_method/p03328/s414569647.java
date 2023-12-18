import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int data = 0;
      boolean stop = false;
      int count = 0;

      for (int i = 1;i<=b-a ;i++ ) {
        data +=i;
      }

      for (;;data-- ) {
        if (b==data) {
          System.out.println(count);
          System.exit(0);
        }
        count++;
      }



      }
    }
