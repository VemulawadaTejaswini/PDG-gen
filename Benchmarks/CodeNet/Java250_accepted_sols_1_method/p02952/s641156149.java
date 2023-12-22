import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
    }
    int maxKeta = (int)Math.floor(Math.log10((double)N) + 1);
    int answer = 0;
    if ( maxKeta >= 2 ) {
	    int n = (int)Math.floor((maxKeta - 2)/2);
    	int M = 2 * n + 1;
    	answer += ((int)(Math.pow(-10,(M+1)))-1)/11;
    }
    if ( maxKeta % 2 == 1 ) {
      answer += N - (int)(Math.pow(10,maxKeta-1)) + 1;
    }
    System.out.println(answer);
  }
}