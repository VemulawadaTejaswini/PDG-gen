import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int K = s.nextInt();
	    String S = s.next();
	    int lenS = S.length();
	    if(lenS <= K) {System.out.println(S);}
	    else {
	    	System.out.println(S.substring(0,K)+"...");
	    	
	    }
		
	}

}
