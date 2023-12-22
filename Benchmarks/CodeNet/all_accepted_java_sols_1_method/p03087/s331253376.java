import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		int[] count = new int[n+1];
		for(int i=0;i<n-1;i++) {
			count[i+1] += count[i];
			if(s.charAt(i)=='A' && s.charAt(i+1)=='C') {
				count[i+1]++;
			}
		}
		for(int i=0;i<q;i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			System.out.println(count[r-1]-count[l-1]);
		}
		in.close();

	}

}