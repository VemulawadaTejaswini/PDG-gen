import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (b>c) {
      int t = c;
      c = b;
      b = t;
    }
    if (a>b) {
      int t = a;
      a = b;
      b = t;
    }
    if (b>c) {
      int t = c;
      c = b;
      b = t;
    }
    System.out.println(a+" "+b+" "+c);
  }
}
