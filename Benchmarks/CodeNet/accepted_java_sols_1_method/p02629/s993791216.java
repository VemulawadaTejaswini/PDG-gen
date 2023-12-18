import java.util.*;
import java.util.Collections;
public class Main {
	public static void main(String[] args){	
      Scanner sc = null;
      sc = new Scanner(System.in);
      long N = sc.nextLong();
      String ans = "";
     
      while(N-- > 0){
        ans = (char)('a' + (N%26)) + ans;
        N /= 26;
      }
      System.out.println(ans);
    }
}