import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int x = a + a - 1;
    int y = b + b - 1;
    int z = a + b;
    int s = 0;
    
    if ( y > x ) {
      s = y;
    } else {
      s = x;
    }
    
    if ( z > s ) {
      s = z;
    }
    
    System.out.println(s);
  }
}