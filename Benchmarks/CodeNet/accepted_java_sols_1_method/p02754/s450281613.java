import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = N/(A+B);
    long D = N%(A+B);
    
    if(A==0){
      System.out.println(0);
    } else if(D<=A) {
      System.out.println(C*A+D);
    } else if(D>A) {
      System.out.println(C*A+A);
    }
  }
}