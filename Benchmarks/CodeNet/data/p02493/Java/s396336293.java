public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		String str1 = in.next();
		int idx = java.lang.Integer.parseInt(str1);
		String[] a = new String[idx];
		int[] b = new int[idx];
		for(int i = 0; i < idx; i++) {
			a[i] = in.next();
			b[i] = java.lang.Integer.parseInt(a[i]);
		}
		for(int i = idx - 1; i >= 0; i--) {
			System.out.print(b[i]);
			if (i != 0)
				System.out.print(" ");
			else
				System.out.println("");
		}
	}
}