import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		while ((n = scan.nextInt())!=0) {
			int a=0,b=0;
			for (int i = 0; i < n; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();

				if(x>y) a+=x+y;
				if(x<y) b+=x+y;
				if(x==y){
					a+=x;
					b+=y;
				}
			}

			System.out.println(a+" "+b);
		}
	}
}