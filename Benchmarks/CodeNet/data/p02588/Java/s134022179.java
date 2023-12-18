import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] s = new int[100][100];
		int[][] x = new int[N][2];
		int[][] a = new int[100][100];
		for(int i = 0; i < N; i++) {
			x[i][0] = 50;
			x[i][1] = 50;
			String S = sc.next();
			double A = Double.parseDouble(S);
			if(S.contains(".")) {
				int ten = S.length() - S.indexOf(".") - 1;
				for(int j = S.length()-1; j >= 0; j--) {
					if(S.charAt(j) == '0')
						ten--;
					else
						break;
				}
				x[i][0] += ten;
				x[i][1] += ten;
				A *= Math.pow(10, ten);
			}
			while(A % 5 == 0) {
				A /= 5;
				x[i][0]--;
			}
			while(A % 2 == 0) {
				A /= 2;
				x[i][1]--;
			}
			a[x[i][0]][x[i][1]]++;
		}
		for(int  i = 0; i < 99; i++)
			for(int j = 0; j < 99; j++)
				s[i+1][j+1] = s[i][j+1] + s[i+1][j] - s[i][j] + a[i][j];
		long ans = 0;
		for(int i = 0; i < N; i++) {
			if(x[i][0] <= 50 && x[i][1] <= 50)
				ans--;
			ans += s[100-x[i][0]+1][100-x[i][1]+1];
		}
		System.out.println(ans/2);
	}

}
