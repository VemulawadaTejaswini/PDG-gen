import java.util.*;
public class Main{
	public static final Scanner sc = new Scanner(System.in);
  	public static void main(String[] arg){
		String s = sc.next();
		long k = sc.nextLong();
        char c;
        char ans = '1';
        for (int i = 0; i<s.length(); i++){
        	c = s.charAt(i);
            if (ans != c){
            	ans = c;
                break;
            }
            k--;
            if (k==0){
            	break;
            }
        }
        System.out.println(ans);
    }
}