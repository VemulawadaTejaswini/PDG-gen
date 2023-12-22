import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      int A =sc.nextInt();
      int B =sc.nextInt();
      
      int m1 =A+B;
      int m2 =A-B;
      int m3 =A*B;
      
   System.out.print(Math.max(m1,Math.max(m2,m3)));
    }
}