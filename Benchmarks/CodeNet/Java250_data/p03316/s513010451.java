import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    while (input.hasNext()){
      int N = input.nextInt();

      if (N % digitSum(N) == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
  
  private static int digitSum (int N){
     int digitSum = 0;
     
     while(N > 0){
        digitSum += N % 10;
        N /= 10;
     }
    
     return digitSum;
  }
}