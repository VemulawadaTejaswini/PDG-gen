public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		double sum = 0;
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			sum += x[i];
		}
		double val = sum / n;
		val = Math.round(val);
		int avg = (int)val;
		

		for(int i = 0; i < n; i++) {
			int num = avg - x[i];
			num = num * num;
			total += num;
		}
		
		System.out.println(total);
	}
}
