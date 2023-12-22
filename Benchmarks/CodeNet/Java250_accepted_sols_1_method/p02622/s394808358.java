import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();

    char[] cS = S.toCharArray();
    char[] cT = T.toCharArray();

    int ans = 0;

    for(int i = 0; i < S.length(); i++) {
    	if(cS == cT) {
    		System.out.println(ans);
    		return;
    	}
      	if(cS[i] != cT[i]) {
    		ans++;
    	}
    }
    System.out.println(ans);
  }
}