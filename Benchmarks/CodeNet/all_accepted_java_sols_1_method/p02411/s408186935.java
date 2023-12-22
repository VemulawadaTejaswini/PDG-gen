import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();
		while(m != -1 || f != -1 || r != -1){
			if(m == -1 || f == -1){
				System.out.printf("F");
			} else if ((m=m+f)<30){
				System.out.printf("F");
			} else if (m<50){
				if(r >= 50) {
					System.out.printf("C");
				} else {
					System.out.printf("D");
				}
			} else if (m<65){
				System.out.printf("C");
			} else if (m<80){
				System.out.printf("B");
			} else {
				System.out.printf("A");
			}
			System.out.println();
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}
	}
}
