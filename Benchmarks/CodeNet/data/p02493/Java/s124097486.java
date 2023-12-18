import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int a[] = new int[length];
		
		for(int i = 0; i < length; i++) {
			a[i] = sc.nextInt();
		}
		
		
		//竪臓即巽造尊
		for(int i = length - 1; i > 0; i--) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print(a[0]);
	}

}