import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();

		if (H % 3 == 0 || W % 3 == 0) {
			System.out.println(0);
			return;
		}

		long answer = H * W;
		long[] abc = new long[]{0, 0, 0};

		for (int i = 0; i < 2; i++) {
			if (i == 1) {
				long t = W;
				W = H;
				H = t;
			}

			for (long h = 1; h < H; h++) {
				abc[0] = h * W;
				abc[1] = (H - h) * (W / 2);
				abc[2] = (H - h) * (W - (W / 2));
				Arrays.sort(abc);
				answer = Math.min(answer, abc[2] - abc[0]);

				abc[0] = h * W;
				abc[1] = ((H - h) / 2) * W;
				abc[2] = ((H - h - ((H - h) / 2))) * W;
				Arrays.sort(abc);
				answer = Math.min(answer, abc[2] - abc[0]);
			}
		}

		System.out.println(answer);
	}
}
