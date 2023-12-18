import java.util.Scanner;


public class Main {

	public long calcBalance(long first, int weeks) {
		if (weeks == 0) { return first;
		} else {
			return calcBalance((long)(1000*Math.ceil((first*1.05)/1000.0)), weeks-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println((new Main()).calcBalance(100000, sc.nextInt()));

	}
}