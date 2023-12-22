import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int i,j;
		for(i = 0; i < 5; i++)
			a[i] = scan.nextInt();

		int k = scan.nextInt();

		for(i = 0; i < 4; i++) {
			for(j = i + 1; j < 5; j++) {
				if(Math.abs(a[i] - a[j]) > k) {
					System.out.println(":(");
					return;
				}
			}
		}
		System.out.println("Yay!");
	}
}
