import java.util.Scanner;

public class Main {
	int anum = 1;
	int bnum = 0;
	int cnum = 0;

	void run() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		char turn = a.charAt(0);
		while(true) {
			if(turn == 'a') {
				if(anum == a.length()) {
					System.out.println("A");
					break;
				}
				turn = a.charAt(anum);
				anum++;
			}else if (turn == 'b') {
				if(bnum == b.length()) {
					System.out.println("B");
					break;
				}
				turn = b.charAt(bnum);
				bnum++;
			}else {
				if(cnum == c.length()) {
					System.out.println("C");
					break;
				}
				turn = c.charAt(cnum);
				cnum++;
			}


		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}