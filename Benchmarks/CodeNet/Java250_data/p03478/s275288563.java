import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
	  int A = scan.nextInt();
	  int B = scan.nextInt();
	  int ans = 0;
	  int i_tmp = 0;
	  for( int i = 1; i <= N; i++ ) {
		  i_tmp = i;
		  int divide = 10;
		  int sum = 0;
		  int digit = 1;
		  while( true ) {
			  if( i_tmp / divide >= 10 ) {
				  digit++;
				  divide *= 10;
			  }else {
				  divide /= 10;
				  break;
			  }
		  }
		  divide = (int)Math.pow( 10, digit );
		  while( true ) {
			  sum += i_tmp / divide;
			  if( i_tmp < 10 ) {
				  sum += i_tmp % 10;
				  break;
			  }
			  i_tmp = i_tmp % divide;
			  divide /= 10;
			  if( divide <= 10 ) {
				  sum += i_tmp / 10;
				  sum += i_tmp % 10;
				  break;
			  }
		  }
		  if( A <= sum && sum <= B ){
			  ans += i;
		  }
	  }
	  System.out.println( ans );
  }
}
