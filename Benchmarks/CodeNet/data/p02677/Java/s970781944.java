package abc168_c;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A, B, H, M;

		A = Integer.parseInt(in.next());
		B = Integer.parseInt(in.next());
		H = Integer.parseInt(in.next());
		M = Integer.parseInt(in.next());

		float alpha = 360 * H / 12 + 360 * M / 720;
		float beta = 360 * M / 60;
		float theta = Math.min(Math.abs(alpha - beta), 360-Math.abs(alpha - beta));

		double ans = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(Math.toRadians(theta)));
		System.out.println(ans);
	}
}
