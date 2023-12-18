import java.util.Scanner;
import java.util.Vector;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    Vector<Integer> vec = new Vector<Integer>();
    while(sc.hasNextInt()){
      vec.add( sc.nextInt() );
    }
		for ( Integer n: vec){
			if( 9*4 < n ){
				System.out.println("0");
			}else{
				int cnt = 0;
				for ( int i = 0; i <= 9; i++ ){
				for ( int j = 0; j <= 9; j++ ){
				for ( int k = 0; k <= 9; k++ ){
				for ( int l = 0; l <= 9; l++ ){
					int sum = i+j+k+l;
					if ( sum == n )
					{
						cnt++;
					}
				}}}}
				System.out.println(cnt);
			}
		}
  }
}