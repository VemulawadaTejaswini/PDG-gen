
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		long a[] = new long[5000];
		while(true){
			int n = scan.nextInt();
			Arrays.fill(a, 0);
			if(n == 0)break;
			long l = -100000;
			for(int i = 0;i < n;i++){
				int m = scan.nextInt();
				for(int j = 0;j <= i;j++){
					a[j] = a[j] + m;
					l = Math.max(a[j],l);
				}
			}
			System.out.println(l);
		}
		System.exit(0);

	}

}