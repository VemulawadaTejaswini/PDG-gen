import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    int a, b, c;
    
    
    
    Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
    b = sc.nextInt();
    
    c = 2 * b;
    if (c > a) {
      c = a;
    }
    
    
    
    System.out.println(a - c);
    
    return;
  }
}

    
    
    