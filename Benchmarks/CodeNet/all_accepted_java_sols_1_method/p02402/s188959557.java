public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}

		int mini = a[0];
		for (int i:a) { mini = Math.min(mini, i);}

		int maxi = a[0];
		for (int i:a) { maxi = Math.max(maxi, i);}

		long goukei = 0;
		for (int i:a) { goukei = goukei + i;}

		System.out.println(mini + " " + maxi + " " + goukei);
	}
}