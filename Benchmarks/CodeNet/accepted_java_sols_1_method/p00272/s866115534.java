import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,t,m,k;
		for(i=0; i<4; i++) {
			t = sc.nextInt();
			m = sc.nextInt();
			switch(t) {
			case 1:
				k = 6000 * m;
				break;
			case 2:
				k = 4000 * m;
				break;
			case 3:
				k = 3000 * m;
				break;
			default:
				k = 2000 * m;
			}
			System.out.println(k);
		}
	}
}