import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int input = in.nextInt();
		long[] a = new long[input];
		long max = (long)Math.pow(10, 18);
		long ans = 1;
		for(int i = 0;i<input;i++) {
			a[i] = in.nextLong();
		}
		for(int i = 0;i<input;i++) {
		if(a[i] == 0) {
			ans = 0;
			break;
		}
		else if(a[i]>(max/ans)) {
			ans = -1;
		}
		else {
			ans = ans * a[i];
		}
		
		
	}
		System.out.println(ans);

 
 }
}
