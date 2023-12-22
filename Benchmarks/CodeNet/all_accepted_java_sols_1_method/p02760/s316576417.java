import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] a = new int[3][3];
		boolean[][] flag = new boolean[3][3];

		Scanner sc = new Scanner(System.in);

		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a[i].length;j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int n = sc.nextInt();
		int[] b = new int[n];

		for(int i = 0; i < b.length;i++) {
			b[i] = sc.nextInt();
		}

		//inputend

		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a[i].length;j++) {
				for(int k = 0; k < b.length;k++) {
					if(a[i][j] == b[k])flag[i][j]=true;
				}
			}
		}

		for(int i = 0; i < flag.length;i++) {
			if(flag[0][i] && flag[1][i] && flag[2][i]) {
				System.out.println("Yes");
				return;
			}
		}

		for(int i = 0; i < flag.length;i++) {
			if(flag[i][0]&&flag[i][1]&&flag[i][2]) {
				System.out.println("Yes");
				return;
			}
		}

		if((flag[0][0]&&flag[1][1]&&flag[2][2])||(flag[0][2]&&flag[1][1]&&flag[2][0])) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
		return;
	}


}
