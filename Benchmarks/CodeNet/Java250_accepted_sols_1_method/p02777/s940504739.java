import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      String t = sc.next();
      
      int A = sc.nextInt();
      int B = sc.nextInt();
      String u = sc.next();
      
      if(s.equals(u)){
       System.out.println(A-1);
      System.out.println(B);
      }
      else if(t.equals(u)){
      System.out.println(A);
      System.out.println(B-1);
      }
    }
}