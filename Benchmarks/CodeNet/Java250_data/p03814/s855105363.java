import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	int Znum = 0;
    	for (int i = S.length()-1; 0 < i; i--) {
    		if (S.charAt(i) == 'Z') {
    			Znum = i;
    			break;
    		}
    	}
    	System.out.println(Znum - S.indexOf("A")+1);
    }
}