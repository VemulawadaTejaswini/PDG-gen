import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();

		int[] t = new int[n+1];
		for(int k =0; k<n+1; k++) {
			t[k]=0;
		}
		for(int i=0; i<n-1; i++) {
			String sub = s.substring(i,i+2);
			t[i+1] = t[i] + (sub.equals("AC")? 1:0);
		}

		for(int j=0; j<q; j++) {
			int l= in.nextInt();
			int r= in.nextInt();
			System.out.println(t[r-1]-t[l-1]);
		}

	}
}
