import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt(), N=sc.nextInt(), min=1001, sa, ans=-100;
    String p[] = new String[N];
    for(int i=0; i<N; i++) {
      p[i] = sc.next();
	}
    
    for(int j=0; j<=101; j++) {
      if(!Arrays.asList(p).contains(String.valueOf(j))) {
        if(X>=j) {
          sa=X-j;
        } else {
          sa=j-X;
        }
        if(min>sa) {
          ans = j;
          min=sa;
        }
      }  
    }
    System.out.println(ans);
  }
}
