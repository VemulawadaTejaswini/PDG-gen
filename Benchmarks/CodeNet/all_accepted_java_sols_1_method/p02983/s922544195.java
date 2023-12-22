import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    long L = sc.nextInt();
    long R = sc.nextInt();
    sc.close();

    long min = 2019;

    for(int i = 0; i < 2019; i++){
      for(int j = i + 1; j < 2019; j++){
        long a = L + i;
        long b = L + j;
        if (a <= R && b <= R){
          long m = (a*b)%2019;
          if (m < min){
            min = m;
          }
        }
      }
    }

    System.out.println(min);

  }
  
}