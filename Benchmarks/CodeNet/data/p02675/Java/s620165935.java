import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int I = sc.nextInt();
    	String S = Integer.toString(I);
    	char s = S.charAt(S.length()-1);
    	if (s == '3') {
    		System.out.println("bon");
    	} else if (s == '0' || s == '1' || s == '6' || s =='8') {
    		System.out.println("pon");
    	} else {
    		System.out.println("hon");
    	}
    }
}