public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		int sum = 1;
		
		p[0] = sc.nextInt();
		int min = p[0];

		for (int i = 1; i < n; i++) {
			p[i] = sc.nextInt();
			if(p[i] < min) {
				min = p[i];
				sum++;
			}
		}

		System.out.println(sum);

	}
}
