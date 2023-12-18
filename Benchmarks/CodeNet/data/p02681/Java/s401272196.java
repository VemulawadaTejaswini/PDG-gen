import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String x = S.substring(0,S.length()-1);
		String y = T.substring(0,S.length()-1);
		if(x.equals(y)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
  }
}