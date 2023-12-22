import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int senen = 1000;
	    
	    while (true) {
	      if (N <= 0) { break; }
	      N = N - senen;
	    }
	    
	    System.out.println(Math.abs(N));
  }
}