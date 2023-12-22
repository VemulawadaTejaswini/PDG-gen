import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int K = Integer.parseInt(sc.nextLine());
	    String S = sc.nextLine();
	    int Slength = S.length();
	    
	    if(Slength>K) {
	    	System.out.println(S.substring(0, K)+"...");
	    }else {
	    	System.out.println(S);
	    }
    }

}
