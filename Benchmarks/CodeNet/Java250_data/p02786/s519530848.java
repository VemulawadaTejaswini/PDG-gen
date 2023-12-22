import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long j = 1;
		long count = 0;
		while(1 <= H) {
			count+= j;
			H /= 2;
			j *= 2;
		}
		System.out.println(count);
	}

}
