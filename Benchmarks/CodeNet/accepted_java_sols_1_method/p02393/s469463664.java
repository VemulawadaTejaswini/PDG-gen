import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] valus = {a, b, c};
		int min = valus[0];
		int max = valus[0];

		for(int i = 0; i < valus.length - 1; i++) {
			for(int j = 1; j < valus.length; j++) {
				min = Math.min(valus[i], valus[j]);
				max = Math.max(valus[i], valus[j]);

				valus[i] = min;
				valus[j] = max;

			}
		}

		for(int i = 0; i < valus.length; i++) {
			if(i == valus.length-1) {
				System.out.println(valus[i]);
			} else {
				System.out.print(valus[i] + " ");
			}
		}

	}

}
