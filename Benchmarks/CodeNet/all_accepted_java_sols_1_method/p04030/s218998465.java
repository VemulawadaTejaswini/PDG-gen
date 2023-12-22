import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int nam = s.length();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < nam ;i++){
		    if(s.charAt(i) == '0'){
		       sb.append('0');
		    }else if(s.charAt(i) == '1'){
		       sb.append('1');
		    }else if(s.charAt(i) == 'B'){
		       if (sb.length() >= 1) {
                sb.setLength(sb.length()-1);
            }
		  }
		}
		System.out.print(sb);
	}
}
