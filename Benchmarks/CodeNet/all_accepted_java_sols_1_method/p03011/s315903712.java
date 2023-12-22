import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int x = A+B;
    int y = B+C;
    int z = C+A;
    
    System.out.println(Math.min(x,Math.min(y,z)));
  }
}