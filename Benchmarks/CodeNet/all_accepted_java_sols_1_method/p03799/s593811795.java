import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long S = cin.nextLong();
		long C = cin.nextLong();
		
		long count = 0;
		if (C >= S * 2) {
			count += S;
			C -= S * 2;
			count += C / 4;
		} else {
			count += C / 2;
		}
		
		System.out.println(count);
	}
}


