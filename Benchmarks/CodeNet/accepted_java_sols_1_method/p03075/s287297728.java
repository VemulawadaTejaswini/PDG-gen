import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		int k = Integer.parseInt(sc.next());
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0+(i+1); j--) {
				if(Math.max(a[i], a[j]) - Math.min(a[i], a[j]) > k) {
					System.out.println(":(");
					return;
				}
			}
		}
		System.out.println("Yay!");
	}
}
