import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    char x = 'a';
    for(int i = 0; i < 300; i++) {
    	if(x == 'a') {
    		if(a.length() == 0) {
    			System.out.println("A");
    			break;
    		} else {
    			x = a.charAt(0);
    			a = a.substring(1);
    		}
    	}
    	if(x == 'b') {
    		if(b.length() == 0) {
    			System.out.println("B");
    			break;
    		} else {
    			x = b.charAt(0);
    			b = b.substring(1);
    		}
    	}
    	if(x == 'c') {
    		if(c.length() == 0) {
    			System.out.println("C");
    			break;
    		} else {
    			x = c.charAt(0);
    			c = c.substring(1);
    		}		
    	}        					
    }
}
}
