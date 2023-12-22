import java.io.BufferedReader;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = 0;
		long A = 0;
		long R = 0;
		long C = 0;
		long H = 0;
		for(int i = 0; i < N; i++) {
			String Si = sc.next();
			switch(Si.substring(0, 1)) {
			case "M":
				M++;
				break;
			case "A":
				A++;
				break;
			case "R":
				R++;
				break;
			case "C":
				C++;
				break;
			case "H":
				H++;
				break;
			}
		}
		long x = 0;
		x = M * A * R;
		x += M * A * C;
		x += M * A * H;
		x += M * R * C;
		x += M * R * H;
		x += M * C * H;
		x += A * R * C;
		x += A * R * H;
		x += A * C * H;
		x += R * C * H;
		System.out.println(x);
	}
}