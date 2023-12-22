import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int A = s.nextInt();
    int B = s.nextInt();
      if ( A+B >= A-B){
        if (A*B >= A+B){
          System.out.println(A*B);
        }
        if (A*B < A+B){
          System.out.println(A+B);
        }
      }
      if ( A+B < A-B){
        if (A*B >= A-B){
          System.out.println(A*B);
        }
        if (A*B < A-B){
          System.out.println(A-B);
        }
      }
  }
}