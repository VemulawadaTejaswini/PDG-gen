import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
//    String a;
    int cnt=0,ans,a,b;
    a = Integer.parseInt(sc.next());
    b = Integer.parseInt(sc.next());
    
    ans = 1;
    while(true){
	  if(ans >= b) break;    
	  ans += a-1;
      //System.out.println(ans);
      cnt++;
    }
    System.out.println(cnt);
  }
}