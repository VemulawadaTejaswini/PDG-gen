import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long M = input.nextLong();
		long tempN = 0; long cnt = 0;
		if (N%2==1) tempN=N/2+1;
		else tempN=N/2;
		for (int i = 0; i < M; i++) {
			if (i%2==0) cnt+=tempN;
			else cnt+=(N-tempN);
		}
		if (N==1||M==1) System.out.println(1);
		else System.out.println(cnt);
	}
}