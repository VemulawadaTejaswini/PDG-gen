


import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.next();
		String b=scanner.next() ;
		int length = Math.min(a.length(), b.length());
	    int pos = 0;
	    while (pos < length) {
	        if (0 != (a.charAt(pos) ^ b.charAt(pos))) {
	            break;
	        }
	        pos++;
	    }
	   // System.out.println(a.substring(pos));
	    //System.out.println(b.substring(pos));

	    	if(a.substring(pos).length()==0) {
	    		System.out.println("Yes");
	    	}
	    	else {
	    		System.out.println("No");
	    	}


		}


}
