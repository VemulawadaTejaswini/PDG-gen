import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long count = x/11;
		count*=2;
		long temp = x-x/11*11;
		if (temp>6) {
			count+=2;
		} else if (temp>0) {
			count++;
		}
		System.out.println(count);
	}
}
