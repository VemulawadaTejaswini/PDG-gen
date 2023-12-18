import java.util.*;
import java.util.Collection;

public class Main {
	public static void main(String[] args){	
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      String answer = "";
     
      while(N-- > 0){
        answer += (char)('a' + (N%26));
        N /= 26;
      }
      System.out.println(answer);
    }
}
