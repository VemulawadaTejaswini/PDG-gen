
public class Main {
	public static void main(String[] age){

		int x = new java.util.Scanner(System.in).nextInt();
		int i = 1;
		int j = 1;
		int y = 0;

		while( x>=3){
			x = x-3;
			i++;
		}

		for( j=1 ; j<i ; j++ ){
			y = j*3;
			System.out.print(" " + y);
		}
	}
}