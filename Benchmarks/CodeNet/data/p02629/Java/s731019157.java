import java.util.*;
import java.util.Collections;
public class Main {
	public static void main(String[] args){	
      Scanner sc = null;
      sc = new Scanner(System.in);
      long N = sc.nextInt();
      String ans = "";
      char[] al = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     
      while(N > 0){
        int index = (int)N % 26;
        ans += al[index-1];
        N /= 26;
      }
      StringBuffer str = new StringBuffer(ans);
      System.out.println(str.reverse().toString());
    }
}