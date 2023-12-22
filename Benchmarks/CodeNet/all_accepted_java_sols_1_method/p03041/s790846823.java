import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      String S = sc.next();
      String T = S.substring(K-1,K).toLowerCase();
      System.out.println(S.substring(0,K-1)+ T +
                         S.substring(K,N));
    }
}