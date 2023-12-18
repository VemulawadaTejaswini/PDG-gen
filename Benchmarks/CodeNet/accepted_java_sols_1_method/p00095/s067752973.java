import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max = -1;
		int ind = -1;
		for(int i = 0; i < n; ++i){
			int d = sc.nextInt();
			int c = sc.nextInt();
			if( c > max ){
				max = c;
				ind = d;
			}else if( c == max ){
				if( ind > d ) ind = d;
			}
		}
		
		System.out.println( ind + " " + max );
		
	}
}