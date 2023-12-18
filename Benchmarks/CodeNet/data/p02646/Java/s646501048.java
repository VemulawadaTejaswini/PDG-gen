import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long V = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long W = Long.parseLong(sc.next());
		long T = Long.parseLong(sc.next());
		sc.close();

		if(Math.abs(B - W * T) <= 1000000000 && Math.abs(B - W * T) <= 1000000000) {
			if(V > W) {
				long diff = V - W;
				long distance = Math.abs(B - A);
				long check = distance / diff;
				if(distance % diff == 0 && check <= T) {
					System.out.println("YES");
					return;
				}else {
					System.out.println("NO");
					return;
				}
			}else {
				System.out.println("NO");
				return;
			}
		}else {
			if(B < A) {
				long time = Math.abs(-1000000000 - B) / W;
				long posB = B - W * time;
				long onePosB = -1000000000 + (-1000000000 - (posB - W));
				long checkAtime = (posB - A) / V;
				long checkBtime = (onePosB - A) / V;
				if((checkAtime <= T && (posB - A) % V == 0) || (checkBtime <= T && (onePosB - A) % V == 0)) {
					System.out.println("YES");
					return;
				}else {
					System.out.println("NO");
					return;
				}
			}else {
				long time = Math.abs(1000000000 - B) / W;
				long posB = B - W * time;
				long onePosB = 1000000000 - ((posB + W) - 1000000000);
				long checkAtime = (posB - A) / V;
				long checkBtime = (onePosB - A) / V;
				if((checkAtime <= T && (posB - A) % V == 0) || (checkBtime <= T && (onePosB - A) % V == 0)) {
					System.out.println("YES");
					return;
				}else {
					System.out.println("NO");
					return;
				}
			}
		}
	}
}