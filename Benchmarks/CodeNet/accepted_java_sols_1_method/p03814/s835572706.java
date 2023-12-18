import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 String s  = in.next();
		 int nam = s.length();
		 
		 int cnt = 0;int memo = 0;
		 for(int i = 0; i < nam ; i++){
		     if(s.charAt(i)=='A' && cnt == 0){
		         cnt = 1;
		     }else if(cnt>0){
		         cnt++;
		         if(s.charAt(i) == 'Z'){
		             memo = cnt;
		         }
		     }
		 }
        System.out.print(memo);
	}
}