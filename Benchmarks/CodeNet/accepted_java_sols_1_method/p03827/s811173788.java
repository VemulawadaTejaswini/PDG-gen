import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int N = scan.nextInt();
        String S = scan.next();
        
        int x = 0;
        int cnt = 0;
        
        String[] strArray = S.split("");
		for(String s_one : strArray) {
		  if(s_one.charAt(0) == 'I')x++;
          else if(s_one.charAt(0) == 'D')x--;
          
          if(x > cnt)cnt = x;
		}
        
        System.out.println(cnt);
	  }
}