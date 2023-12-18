import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		int[] tintin = new int[n+1];
		tintin[0] = Math.abs(a[0]);
		for(int i=1;i<n;i++) {
			tintin[i] = tintin[i-1] + Math.abs(a[i]-a[i-1]);
		}
		tintin[n] = tintin[n-1] + Math.abs(a[n-1]);
		
		int[] tkb = new int[n];
		tkb[0] = Math.abs(a[1]);
		for(int i=1;i<n-1;i++) {
			tkb[i] = Math.abs(a[i+1]-a[i-1]);
		}
		tkb[n-1] = Math.abs(a[n-2]);
		
		String ls = System.lineSeparator();
		StringBuilder sb = new StringBuilder();
		sb.append(tkb[0]+tintin[n]-tintin[1]);
		sb.append(ls);
		for(int i=1;i<n-1;i++) {
			sb.append(tintin[i-1]+tkb[i]+tintin[n]-tintin[i+1]);
			sb.append(ls);
		}
		sb.append(tintin[n-2]+tkb[n-1]);
		sb.append(ls);
		System.out.println(sb.toString());
		in.close();
	}

}
