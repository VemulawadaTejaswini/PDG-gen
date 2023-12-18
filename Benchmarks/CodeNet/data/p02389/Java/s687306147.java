import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);

		    int N = scanner.nextInt();
		    int M = scanner.nextInt();
		    
		    System.out.print(N * M);
		    System.out.print(" ");
		    System.out.print(2 * N + 2 * M);
        	scanner.close();}
		  }

