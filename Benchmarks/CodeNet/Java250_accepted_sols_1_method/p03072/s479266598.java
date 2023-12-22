import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		int highest = 0;
		int count =0;
		for(int i = 0; i < n; i++) {
			ary[i] = sc.nextInt();
			if(ary[i] >= highest) {
				count++;
				highest = ary[i];
			}
		}
		System.out.println(count);
	}
}
