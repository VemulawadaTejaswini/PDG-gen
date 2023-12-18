import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    sc.close();
	    
	    String answer;
	    
	    if(N > 999) {
	    	answer = "ABD";
	    }else {
	    	answer = "ABC";
	    }
	    
	    System.out.println(answer);
	    System.exit(0);
	}
}