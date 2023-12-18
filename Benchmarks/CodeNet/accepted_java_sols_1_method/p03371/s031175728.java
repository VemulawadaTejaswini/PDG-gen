import java.util.Scanner;

public class  Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    int sum = 0;
    
    if(A+B>C*2){
      int temp = Math.min(X, Y);
      sum += temp*C*2;
      X -= temp;
      Y -= temp;
    }
    
    if(A>C*2){
      sum += X*C*2;
    } else {
      sum += X*A;
    }
    
    if(B>C*2){
      sum += Y*C*2;
    } else {
      sum += Y*B;
    }
    
    System.out.println(sum);
  }
}
        