public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int j = 0;
			double[] s = new double[n];
			int count = 0;
			for(int i = 0;i < n;i++) {
				s[i] = sc.nextDouble();
			}
			for(int i = 0;i < n; i++){
					for(j = i + 1;j < n;j++) {
						double f = s[i] * s[j];
						int k = (int)f;
						if(f == k && i != j) {
							count++;
						}
					}
			}
			System.out.println(count);
	}
}
