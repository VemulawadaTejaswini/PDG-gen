public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int[] h = new int[n];
		int res = 0;
		int count = 0;
		for(int i=0;i<n;i++) {
			h[i] = s.nextInt();
			if(1<= i) {
				if(h[i]<=h[i-1]) {
					count++;
				}else {
					res = Math.max(count, res);
					count=0;
				}
			}
		}
		res = Math.max(count, res);
		System.out.println(res);

	}
}
