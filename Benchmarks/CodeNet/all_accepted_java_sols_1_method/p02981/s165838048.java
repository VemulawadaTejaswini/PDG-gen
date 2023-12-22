import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
	int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(b < a*n) System.out.println(b);
    else System.out.println(a*n);

  }
}
