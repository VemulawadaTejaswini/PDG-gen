import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nam = in.nextInt();
		String s = in.next();
		int s_len = s.length();
		char[] s_chars = s.toCharArray();
        
        if(nam <  s_len ){
             for(int i = 0 ; i < nam;i++){
            System.out.print(s_chars[i]);
        }
        System.out.print("...");
        }else{
            System.out.println(s);
        }

      
	}
}
