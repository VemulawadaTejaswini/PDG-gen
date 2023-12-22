import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    int A = 0;
	    for (int i = 0; i < M; i++) {
	      int temp = sc.nextInt();
	      A += temp;
	    }
	    
	    if (N < A) {
	      System.out.println(-1);
	    } else {
	      System.out.println(N - A);
	    }
	    
	  }
}