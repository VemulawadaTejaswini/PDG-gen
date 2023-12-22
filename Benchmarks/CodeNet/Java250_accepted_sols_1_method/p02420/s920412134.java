import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String str;
		String sh_str;
		int sh_num;
		int[] sh;

		Scanner sc= new Scanner( System.in );

		while ( true) {
			sh_num = 0;
			str = sc.next();

			if ( str.equals("-") ) {
				break;
			}

			sh_num  = sc.nextInt();

			sh = new int[sh_num];

			for ( int i = 0 ; i < sh_num ; i++ ) {
				sh[i]= sc.nextInt();
			}

			for ( int i = 0 ; i < sh_num ; i++ ) {
				sh_str = "";

				sh_str += str.substring(sh[i],str.length());
				sh_str += str.substring(0,(sh[i]));

				str = sh_str;
			}
			System.out.println( str );
		}

		sc.close();
	}
}

