import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] x = new int[4];	
		
		for(int i = 0; i < N; i++) {
			String a = sc.next();
			char b = a.charAt(0);
			if(b == 'P') {
				x[0] = 1;
			} else if(b == 'W') {
				x[1] = 1;
			} else if(b == 'G') {
				x[2] = 1;
			} else if(b == 'Y') {
				x[3] = 1;
			}
		}
		
		int count = 0;
		
		for(int i = 0; i < 4; i++) {
			if(x[i] == 1) {
				count++;
			}
		}
		if(count == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}
	}
}
