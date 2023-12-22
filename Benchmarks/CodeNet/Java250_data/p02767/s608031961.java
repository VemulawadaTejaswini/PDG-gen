import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] list = new int[N][100];
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			for(int j = 1; j <= 100; j++) {
				list[i][j-1] = (j-a)*(j-a);
			}
		}
		int ans = listCheck(list);
		System.out.println(ans);
	}
	
	public static int listCheck(int[][] list) {
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < 100; i++) {
			int check = 0;
			for(int j = 0; j < list.length; j++) {
				check += list[j][i];
			}
			if(ans > check) {
				ans = check;
			}
		}
		return ans;
	}
}