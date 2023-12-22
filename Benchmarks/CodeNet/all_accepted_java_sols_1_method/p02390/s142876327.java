import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long[] hms = new long[3];
		hms[0] = a % 60;
		a /= 60;
		hms[1] = a % 60;
		a /= 60;
		hms[2] = a;
		System.out.println(hms[2] + ":" + hms[1] + ":" + hms[0]);
	}
}
