import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int k = 0;
    
    if ((a+b)%2 != 0) {
      System.out.println("IMPOSSIBLE");
      return;
    } else {
      System.out.println((a+b)/2);
    }

  }
}
