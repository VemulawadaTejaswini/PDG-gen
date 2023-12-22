import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		boolean hantei =true;

		String[] wakeru = s.split("");
			for(int i=0;i<a;i++) {
			if(wakeru[i].equals("-")) {
				hantei=false;
			}
		}
		for(int i=a+1;i<a+b+1;i++) {

			if(wakeru[i].equals("-")) {
				hantei=false;
			}
		}
		if(!wakeru[a].equals("-")) {
			hantei=false;
		}


		if(hantei) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}

	}

}
