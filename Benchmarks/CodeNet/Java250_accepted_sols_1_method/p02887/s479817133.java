import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  String s = sc.next();
	  char[] S = s.toCharArray();
	  //合体後の文字列
	  StringBuilder sb = new StringBuilder();
	  sb.append(S[0]);
	  
	  for(int i=1; i<N; i++) {
		  if(S[i] != S[i-1]) {
			  sb.append(S[i]);
		  }
	  }
	  int ans = sb.length();
	  out.println(ans);
  }
}