import java.util.Scanner;

public class Main {
	    public static void main (String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	int N = scanner.nextInt();
	    	int D = scanner.nextInt();
	    	int count = 0;
	    	for(int i=0;i<N;i++) {
	    		double X = scanner.nextInt();
	    		double Y = scanner.nextInt();
	    		if(Math.sqrt(X*X+Y*Y) <= D) {
	    			count++;
	    		}
	    	}
	    	System.out.println(count);
	    	scanner.close();
	    }
	}