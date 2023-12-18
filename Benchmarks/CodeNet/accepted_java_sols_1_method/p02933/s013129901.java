import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		String S = stdIn.next();
	    if(A >= 3200){
	    	System.out.println(S);
	    }
	    else{
	    	System.out.println("red");
	    }
		stdIn.close();
	}
}
