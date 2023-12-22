import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int D = stdIn.nextInt();
		int T = stdIn.nextInt();
		int S = stdIn.nextInt();
	    double ans = 0;
	    ans = (double)D / (double)S;
	    if(T >= ans){
	    	System.out.println("Yes");
	    }
	    else{
	    	System.out.println("No");
	    }


		stdIn.close();
	}
}