import java.util.Scanner;

public class Main {
	Scanner sc;

	private Main(){
		sc = new Scanner( System.in );
	}

	private void run(){
		while( true ){

			int num = sc.nextInt();
			if( num == 0){ return; }
			int counter;
			String str = sc.next();
			String current = "";
			char[] cstr;
			char prev;

			for( int i = 0; i < num; i++ ){

				counter = 0;
				current = "";
				prev = '*';
				cstr = str.toCharArray();

				for( int j = 0; j < cstr.length; j++ ){
					if( cstr[ j ] == prev ){
						counter++;
					}else{
						if( prev != '*' ){
							current += counter;
							current += prev;
						}
						counter = 1;
					}
					prev = cstr[ j ];
				}
				current += counter;
				current += prev;
				str = current;
			}

			System.out.println( str );

		}
	}


	public static void main( String[] args ){
		new Main().run();
	}
}