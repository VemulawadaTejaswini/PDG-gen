import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int sumPrice = 0;
		int cnt = 0;
		double sumCnt = 0;
		while(sc.hasNext()) {
			cnt++;
			Scanner s = new Scanner(sc.next().replaceAll(",", " "));
			int a = s.nextInt(), b = s.nextInt();
			sumPrice += a * b;
			sumCnt += b;
		}
		System.out.println(sumPrice);
		System.out.println((int)((sumCnt / cnt) + 0.5));
	}
}