import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
        String s2 = sc.next();
        int n = s1.length() - 1;
        for(int i = 0; i < s1.length(); i++){
        	if(s1.charAt(i) != s2.charAt(n)){
            	System.out.println("NO");
                return;
            }
            n--;
        }
        System.out.println("YES");
	}
}