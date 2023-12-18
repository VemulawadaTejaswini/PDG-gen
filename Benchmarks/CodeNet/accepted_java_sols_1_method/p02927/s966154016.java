import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int d = in.nextInt();
		long res = 0;
		for(int i=4;i<=m;i++) {
			for(int j=22;j<=d;j++) {
				int d1 = j%10;
				int d2 = j/10;
				if(d1>=2 && d2>=2 && i==d1*d2) {
					res++;
				}
			}
		}
		System.out.print(res);
		
		in.close();

	}

}
