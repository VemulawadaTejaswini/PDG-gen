import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int n = sc.nextInt();
    int stack;
    int count = 0;
    int count2;
    int div = 1;
    
    if(n < 105) System.out.println(0);
    else{
    	for(int i = 105;i <= n;i+=2){
          stack = i;
          div = 1;
          for(int j = 3;j <= stack;j += 2){
            count2 = 1;
          	while(stack % j == 0){
              stack /= j;
              count2++;
            }
            div *= count2;
          }
          if(div == 8) count++;
        }
      System.out.println(count);
    }

  }
}
