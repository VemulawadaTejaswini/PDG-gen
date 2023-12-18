import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) h[i] = in.nextInt();
		boolean ans = true;
		for(int i=1;i<n;i++) {
			if(-h[i]+h[i-1]>=2) {
				ans = false;
				break;
			}else if(-h[i]+h[i-1]==1) {
				h[i]++;
			}
		}
		System.out.println(ans?"Yes":"No");
		in.close();

	}

}
