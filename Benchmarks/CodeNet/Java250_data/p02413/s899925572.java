import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int[] s = new int[r + 1];
		for(int i = 0; i < c; i++){
			int sum = 0;
			int a = scan.nextInt();
			System.out.print(a);
			sum += a;
			s[0] += a;
			for(int j = 1; j < r; j++){
				a = scan.nextInt();
				System.out.print(" " + a);
				sum += a;
				s[j] += a;
			}System.out.println(" " + sum);
			s[r] += sum;
		}
		System.out.print(s[0]);
		for(int i = 1; i < r + 1; i++){
			System.out.print(" " + s[i]);
		}System.out.println();

	}

}