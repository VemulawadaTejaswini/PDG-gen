import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int Q = stdIn.nextInt();
		int[] c = new int[Q];
		int[] a = new int[Q];
		int[] n = new int[Q];
		for(int i = 0; i < Q; i++) {
			c[i] = stdIn.nextInt();
			a[i] = stdIn.nextInt();
			n[i] = stdIn.nextInt();
		}
		for(int i = 0; i < Q; i++) {
			int count = 0;
			while(true) {
				if(c[i] >= 1 && a[i] >= 1 && n[i] >= 1) {
					count++;
					c[i]--;
					a[i]--;
					n[i]--;
					continue;
				}
				else if(c[i] >= 2 && a[i] >= 1) {
					count++;
					c[i]-= 2;
					a[i]--;
					continue;
				}
				else if(c[i] >= 3) {
					count++;
					c[i] -= 3;
					continue;
				}
				break;
			}
			System.out.println(count);
		}
	}
		
}