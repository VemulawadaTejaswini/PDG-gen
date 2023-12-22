import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int amount = sc.nextInt();
		int outCnt = 0;
		int min = 0;
		for(int i=0;i<cnt;i++) {
			int o = sc.nextInt();
			outCnt++;
			amount -= o;
			if(min > o || min == 0) min = o;
		}
		sc.close();
		outCnt += amount/min;
		System.out.println(outCnt);
	}
}