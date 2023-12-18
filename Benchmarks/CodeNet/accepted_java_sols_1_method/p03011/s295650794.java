import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
    int ans = 0;
    
    int a = p+q;
	int b = q+r;
	int c = r+p;
    
    int d = Math.min(a, b);
    int e = Math.min(b, c);
    ans = Math.min(d, e);
    
    System.out.println(ans);
  }
}
