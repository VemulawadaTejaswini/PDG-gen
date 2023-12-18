import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();

    long x_plus = x;
    long x_minus = x;

    long counter = 0;

    if(x > 0){
      while(true){
        if(counter < k){
          long tmp = x_plus - d;
          if(tmp < 0){
            x_minus = tmp;
            break;
          }
          x_plus = tmp;
          counter++;
        }else{
          break;
        }
      }

      long result = ((k - counter) % 2) == 0 ? x_plus : x_minus;
      System.out.println(Math.abs(result));
    }else{
        while(true){
          if(counter < k){
            long tmp = x_minus + d;
            if(tmp < 0){
              x_plus = tmp;
              break;
            }
            x_minus = tmp;
            counter++;
          }else{
            break;
          }
        }
  
      long result = ((k - counter) % 2) == 0 ? x_minus : x_plus;
      System.out.println(Math.abs(result));
    
    }   

    return;

  }
}