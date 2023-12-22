public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] a = new int[1];
		int[] b = new int[1];
		do {
			int x = sc.nextInt();
			if (x == 0) { break;}
			a[a.length - 1] = x;
			
			b = new int[a.length];
			for (int j = 0;j < a.length;j++){
				b[j] = a[j];
			}
			a = new int[a.length + 1];
			for (int j = 0;j < b.length;j++){
				a[j] = b[j];
			}
		} while (true);
		for (int i = 0;i < b.length;i++) {
			System.out.println("Case " + (i+1) + ": " + b[i]);
		}
	}
}