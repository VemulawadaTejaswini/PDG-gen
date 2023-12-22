import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] d = new int[102];
		for(int i=0; i<d.length; i++) {
			d[i] = i;
		}
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
			d[array[i]] = -1;
		}

		int min = 9999;
		int result = 0;

		if(n == 0) {
			 result = x;
		}
		for(int i=0; i<102; i++) {
			if(d[i] != -1) {
				if(Math.abs(x - i) < min) {
					result = i;
					min = Math.abs(x - i);
				}
			}
		}

		System.out.println(result);
	}
}
