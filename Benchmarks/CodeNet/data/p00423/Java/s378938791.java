import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n;
		while(!((n = scan.nextInt()) == 0)) {
			int a = 0;
			int b = 0;

			int tb;
			int ta;
			for(int i = 0 ; i < n ; i++) {
				if((ta = scan.nextInt()) == (tb = scan.nextInt())) {

					a += ta;
					b += tb;

				}else if(ta > tb) {
					a += (ta +tb);
				}else {
					b += (ta + tb);
				}
			}
			System.out.println(a +" "+ b);
		}


	}
}

