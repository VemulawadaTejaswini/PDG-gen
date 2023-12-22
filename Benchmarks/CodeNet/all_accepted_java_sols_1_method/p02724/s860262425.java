import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      int X =sc.nextInt();
      
      int Z = X/500;
      int B = Z*1000;
      int A = (X-(500*Z))/5;
      int C = A*5;
      
      System.out.print(B+C);
    }
}
