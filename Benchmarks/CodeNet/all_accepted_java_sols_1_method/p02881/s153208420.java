import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      long N = sc.nextLong();
      long min = N;
      long a = 0;
      long b = 0;

      for(long i = 1;i<=Math.sqrt(N);i++){
          if(N%i==0){
             a = i-1;
             b = N/i-1;
        }
          min = Math.min(a+b,min);
      }
      System.out.println(min);
  }
}