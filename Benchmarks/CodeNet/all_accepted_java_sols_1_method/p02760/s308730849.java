import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if(a[j][k]==b) a[j][k] = -1;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if(a[i][0]==-1&&a[i][1]==-1&&a[i][2]==-1) count++;
			if(a[0][i]==-1&&a[1][i]==-1&&a[2][i]==-1) count++;
		}
		if(a[0][0]==-1&&a[1][1]==-1&&a[2][2]==-1) count++;
		if(a[2][0]==-1&&a[1][1]==-1&&a[0][2]==-1) count++;
		if(count>=1) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}