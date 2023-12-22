import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		//for(int i = 1; i < 5; i++) {
			if(a[4] - a[0] > k) {
				System.out.println(":(");
				return;
			}
		//}
		System.out.println("Yay!");
	}
}
