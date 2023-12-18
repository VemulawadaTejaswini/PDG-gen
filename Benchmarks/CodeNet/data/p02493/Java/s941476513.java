import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		Arrays.sort(a);
		String ans = "";
		for(int i = a.length-1; i >= 0; i--) ans+=a[i]+" ";
		System.out.println(ans.trim());
	}
}