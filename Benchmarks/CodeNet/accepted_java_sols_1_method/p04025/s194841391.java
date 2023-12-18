import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int total = 0;
		int[] list = new int[cnt];
		for(int i=0;i<cnt;i++) {
			int num = sc.nextInt();
			list[i] = num;
			total += num;
		}
		sc.close();
		double ave = Math.round((double)total/cnt);
		int cost = 0;
		for(int i=0;i<cnt;i++) {
			int diff = (int)ave - list[i];
			cost += Math.pow(diff, 2);
		}
		System.out.println(cost);
	}
}