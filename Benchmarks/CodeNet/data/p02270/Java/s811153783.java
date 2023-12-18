
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=in.nextInt();
		int w=0;
		for (int i = 0; i < n; i++) {
			w+=in.nextInt();
		}
		int P=(int)Math.ceil((double)w/count);
		System.out.println(P);
		in.close();
	}

}

