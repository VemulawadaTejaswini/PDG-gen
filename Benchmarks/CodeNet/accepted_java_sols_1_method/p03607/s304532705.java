import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int ans = 0;
		int num = a[0];
		int count = 1;
		for(int i=1;i<n;i++) {
			if(a[i]!=num) {
				if(count%2==1) ans++;
				num = a[i];
				count = 1;
			}else {
				count++;
			}
		}
		if(count%2==1) ans++;
		
		System.out.println(ans);
		in.close();
	}

}
