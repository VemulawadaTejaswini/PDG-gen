import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
	  int Y = scan.nextInt();
	  boolean isloop = true;
	  int cnt = 0;
	  int c = 0;
	  int a_maisuu = -1;
	  int b_maisuu = -1;
	  int c_maisuu = -1;
	  int kingaku = 0;
	  for( int a = 0; a <= N; a++ ) {
		  for( int b = 0; b + a <= N; b++ ) {
			  c = N - a - b;
			  cnt++;
			  kingaku = 10000 * a + 5000 * b + 1000 * c;
			  if( a + b + c == N && kingaku == Y && c >= 0 ) {
				  a_maisuu = a;
				  b_maisuu = b;
				  c_maisuu = c;
				  isloop = false;
				  break;
			  }
			  if( !isloop )break;
		  }
		  if( !isloop )break;
	  }
	  System.out.println( a_maisuu + " " + b_maisuu + " " + c_maisuu );
  }
}
