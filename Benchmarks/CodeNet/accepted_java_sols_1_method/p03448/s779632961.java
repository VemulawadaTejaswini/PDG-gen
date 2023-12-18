import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int A,B,C,X;
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		X = scan.nextInt();
		int n = 0;
 
		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				for(int c = 0; c <= C; c++) {
					if((500 * a + 100 * b + 50 * c) == X) {
						n++;
					}
				}
			}
		}
 
		System.out.println(n);
	}
}
