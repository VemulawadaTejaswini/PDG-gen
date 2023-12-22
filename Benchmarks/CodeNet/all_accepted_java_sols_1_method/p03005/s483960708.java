import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
	int k = Integer.parseInt(sc.next());
    
    int ans = n-k;
    
    if(k==1) { ans = 0;}
    
    System.out.println(ans);
  }
}
