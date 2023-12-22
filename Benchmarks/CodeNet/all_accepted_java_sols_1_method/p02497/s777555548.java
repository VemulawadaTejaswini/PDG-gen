import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, f, r, per = 5;
		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		
		while (m != -1 || f != -1 || r != -1) {
			if (m == -1 || f == -1) {
				per = 4; //F
			}else if (m + f < 30) {
				per = 4; //F
			}else if (m + f < 50 ) {
				if (r < 50) {
					per = 3; //D
				}else {
					per = 2; //C
				}
			}else if (m + f < 65) {
				per = 2; //C
			}else if (m + f < 80) {
				per = 1; //B
			}else {
				per = 0; //A
			}
			
			switch (per) {
			case 0:
				System.out.println("A");
				break;
			case 1:
				System.out.println("B");
				break;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("F");
				break;
			}
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}	
	}
}