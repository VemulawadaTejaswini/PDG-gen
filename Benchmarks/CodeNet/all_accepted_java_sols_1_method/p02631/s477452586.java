public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		var kai = a[0];
		for(int i=1;i<n;i++) {
			kai^=a[i];
		}
		for(int i=0;i<n;i++) {
			kai^=a[i];
			System.out.print(kai);
			if(i!=n-1) {
				System.out.print(" ");
			}
			kai^=a[i];
		}
		System.out.println();

	}
}