
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int result = 0;
		int tmp = 0;

		for (int i=0; i <= (N/R); i++) {
			for (int j=0; j <= (N/G); j++) {
				tmp = N - ((R*i) + (j*G));
				if (tmp == 0) {
					result++;
				} else if(tmp > 0 && tmp%B == 0) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}