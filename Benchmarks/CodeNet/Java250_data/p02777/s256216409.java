import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S =sc.next();
      String T =sc.next();
      int A =sc.nextInt();
      int B =sc.nextInt();
      String U =sc.next();
      
      int a = A-1;
      int b = B-1;
      
      if(S.equals(U)){
      System.out.println(a);
      System.out.println(B);  
      }
      else if(T.equals(U)){
         System.out.println(A);
      System.out.println(b);
      }
    }
}