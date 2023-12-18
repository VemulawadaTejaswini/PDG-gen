import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int W = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int a = Math.max(A,B);
    int b = Math.min(A,B);
    
    System.out.println(Math.max(0,a-(b+W)));
  }
}