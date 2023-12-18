import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    double probability = 0;
	    
	    if (N % 2 == 0) {
	    	probability = (double)1 / 2;
	    } else {
	    	probability = (N - N/2) / (double)N;
	    }
	    
	    System.out.println(probability);
	}	
}	