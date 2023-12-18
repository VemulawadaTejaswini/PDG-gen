import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[n];
		int count = 0;
		int flag = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i) {
					continue;
				}
				if (a[i] % a[j] == 0) {
					flag = 1;
					break;
				}
			}
			
			if (flag == 0) {
				count++;
			}
			
			flag = 0;
		}
		
		System.out.println(count);
 
	}
 
}