import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		int a,b,c,count;

		a=kb.nextInt();
		b=kb.nextInt();
		c=kb.nextInt();
		count=0;
		for( int i=a; i<=b; i++) {
			if( 0 == c%i ) {
				count++;
			}
		}
		System.out.println( count );	
	}
}