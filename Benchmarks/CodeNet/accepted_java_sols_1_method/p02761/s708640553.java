import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n,m;
		String num = new String();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();m=sc.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];

		for(int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		for(int i = 0 ; i < 1000; i++) {//1to1000までの数
			String temp = String.valueOf(i);
			if(temp.length() !=n) {//桁数と要求されたのが違うとき
				continue;
			}
			for(int j = 0; j < m; j++) {
				if(temp.charAt(s[j]-1)-'0'!=c[j]) {
					break;
				}else {
					if(j == m -1) {
						System.out.println(i);
						return;
					}
				}
			}
		}

		if(m == 0&&n==1) {
			System.out.println(0);
			return;
		}
		if(m == 0&&n==2) {
			System.out.println(10);
			return;
		}
		if(m == 0&&n==3) {
			System.out.println(100);
			return;
		}
		System.out.println(-1);
		return;




	}

}
