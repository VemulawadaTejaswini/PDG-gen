import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int i = 0;
    double A[] = new double[N];
   
// Input
    for(i=0;i<N;i++){
      A[i] = scn.nextInt();
//      System.out.println(A[i]);
    }
    
// Calculation
//    System.out.println(calc(N,A));
    double answer_tmp = calc(N,A);
    if (answer_tmp < Math.pow(10,9) ){
      	System.out.println((int)answer_tmp);
    } else {
		answer_tmp %= (Math.pow(10,9) + 7);
   		BigDecimal answer = BigDecimal.valueOf(answer_tmp);
    	System.out.println(answer.toPlainString());
    } 
  }
  
  private static double calc(int N, double A[]){
    int i = 0;
    int j = 0;
    double sum = 0;
    
    for(i=0;i<N;i++){
      for(j=i+1;j<N;j++){
        sum += A[i] * A[j];
//        System.out.println(A[i]);
//        System.out.println(A[j]);
      }
    }   
    return sum;
  }
}