import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
        int n =  s.length();
        int count = 0;
        int max = 0;
		char[] s_c = s.toCharArray();
      
      for(int i = 0;i < n ;i++){
       if(s_c[i]=='A'||s_c[i]=='C'||s_c[i]=='G'||s_c[i]=='T'){
         count++;
       }else{
        count = 0;
       }
        max = Math.max(max,count);
      }
      
      System.out.print(max);
	}
}