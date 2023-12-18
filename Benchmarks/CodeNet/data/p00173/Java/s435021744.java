import java.util.*;
public class Main {

		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        int n=9;
	        while(n!=0){
	        	String cl = scan.next();
	        	int am=scan.nextInt();
	        	int pm = scan.nextInt();
	        	System.out.println(cl+" "+(am+pm)+" "+(am*200+pm*300));
	        	n--;
	        	}
	        }
	     
}
	    