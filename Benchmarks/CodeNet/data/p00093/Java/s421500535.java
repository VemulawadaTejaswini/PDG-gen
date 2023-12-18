import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,flag,f=0;
		while(true) {
			flag = 0;
			a=sc.nextInt();
			b=sc.nextInt();
			if ( a == 0 && b == 0 )break;
			else if ( f != 0 )
				System.out.println();
			f++;
			while ( a <= b ) {
				if ( a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
					System.out.println(a);
					flag=1;
				}
				a++;
			}
			if ( flag == 0 )
				System.out.println("NA");
		}
	}
}