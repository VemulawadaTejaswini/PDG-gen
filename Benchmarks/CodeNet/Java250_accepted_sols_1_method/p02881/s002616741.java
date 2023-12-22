import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  long N = scan.nextLong();
	  long moveCnt = (long)Math.pow(10,18);
	  for( long i = 1;i * i <= N;i++ ) {
		  if( N % i != 0 )continue;
		  long j = N / i;
		  if( moveCnt > i + j - 2 ) {
			  moveCnt = i + j - 2;
		  }
	  }
	  System.out.println(moveCnt);
  }
}

