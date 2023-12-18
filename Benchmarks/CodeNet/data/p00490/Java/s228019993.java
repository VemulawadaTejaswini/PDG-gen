public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int mny1 = in.nextInt(); //生地の値段
		int mny2 = in.nextInt(); //トッピングの値段
		int kal = in.nextInt(); //生地のカロリー
		int[] top = new int[n];
		int kalsum = kal;
		for (int i=0; i<n; i++) {
			top[i] = in.nextInt(); //トッピングのカロリー
			kalsum += top[i];
		}
		for (int i=0; i<n; i++) {
			if (kalsum/(mny1+mny2*n) < (kalsum-top[i])/(mny1+mny2*(n-1))) {
				kalsum -= top[i];
				n--;
			}
		}
		System.out.println(kalsum/(mny1+mny2*n));
	}

}