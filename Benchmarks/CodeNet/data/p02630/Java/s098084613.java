
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[100001];
		
		long sum=0;
		int in;
		for(int i=0; i<n; i++) {
			in = sc.nextInt();
			a[in]++;
			sum += in;
		}
		
		int q = sc.nextInt();
		
		int b;
		int c;
		for(int i=0; i<q; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			sum = sum+ (c-b) * a[b];
			a[c] += a[b];
			a[b] = 0;
			System.out.println(sum);
		}
	}

}