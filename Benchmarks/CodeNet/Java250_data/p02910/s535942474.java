import java.util.*;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    String[] sp  = s.split("");
	    boolean hantei = true;
	    for(int i = 1; i <= sp.length; i++) {
	        if(i % 2 == 1) {
	            if(sp[i-1].equals("R") || sp[i-1].equals("U") || sp[i-1].equals("D")) {
	                continue;
	            }else {
	                hantei = false;
	                break;
	            }
	        }else {
	            if(sp[i-1].equals("L") || sp[i-1].equals("U") || sp[i-1].equals("D")) {
	                continue;
	            }else {
	                hantei = false;
	                break;
	            }
	        }
	    }
	    if(hantei) {
	        System.out.println("Yes");
	    }else {
	        System.out.println("No");
	    }
	}
}