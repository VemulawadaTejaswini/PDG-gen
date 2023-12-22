import java.util.Scanner;

class Main{
	public static void main(String[] args){

		int[] hills = new int[10];
		Scanner stdIn = new Scanner(System.in);

		for( int i=0; i<10; i++ ){
			hills[i] = stdIn.nextInt();
		}

		for( int i=0; i<9; i++ ){
			for( int j=i+1; j<10; j++ ){
				if( hills[i] < hills[j] ) {
					int tmp = hills[i];
					hills[i] = hills[j];
					hills[j] = tmp;
				}
			}
		}

		for( int i=0; i<3; i++ ){
			System.out.println(hills[i]);
		}
	}
}