import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception{
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int x = 2 * A -1;
    int y = 2 * B -1;
    int z = A + B;
    
    System.out.println(Math.max(z,Math.max(x,y)));
  }
}