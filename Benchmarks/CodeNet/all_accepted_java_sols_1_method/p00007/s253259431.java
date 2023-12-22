import java.util.Scanner;
import java.util.Vector;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    Vector<Integer> vec = new Vector<Integer>();
    while(sc.hasNextInt()){
      vec.add( sc.nextInt() );
    }
		for ( Integer n : vec ){
			long debt = 100000;
			for ( int i = 0; i < n; ++i ){
				long add = debt / 20;
				long mod = add % 1000;
				if ( 0 < mod) {
					add = add + (1000-mod);
				}
				debt += add;
			}
			System.out.println(debt);
		}

  }
}