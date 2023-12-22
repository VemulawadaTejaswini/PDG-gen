import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		sc.close();


		int ans = Integer.MIN_VALUE;
		if(X < 4) {
			System.out.println(1);
			return;
		}else {
			for(int i = 2; i <= X; i++) {
				int j = 2;
				int tmp = (int) Math.pow(i, j);
				while(tmp <= X) {
					j++;
					tmp = (int) Math.pow(i, j);
				}
				tmp = (int) Math.pow(i, j - 1);
				if(ans < tmp && j > 2) {
					ans = tmp;
				}
			}
			System.out.println(ans);
		}

	}

}