import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] a = {1, 3, 5, 7, 8, 10, 12};
		int[] b = {4, 6, 9, 11};
		
		int counta = 0;
		int countb = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(x == a[i]) {
				counta++;
			} else if(y == a[i]) {
				counta++;
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			if(x == b[i]) {
				countb++;
			} else if(y == b[i]) {
				countb++;
			}
		}
		
		if(counta == 2 || countb == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
