import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z;
		while( x!= 0 || y!= 0 ){
			if( x > y ){
				z = x;
				x = y;
				y = z;
			}
			System.out.println( x + " " + y );
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
}