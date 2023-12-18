import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int sumDigCnt = k / 2;
		int oddDigCnt = k - sumDigCnt;
		System.out.println(sumDigCnt*oddDigCnt);
	}
}