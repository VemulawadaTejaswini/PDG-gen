import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];

		for(int i=0;i<m;i++) {
			s[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}


		for(int i=0;i<Math.pow(10, n);i++) {


			String g = String.valueOf(i);
			boolean flg = true;


			if(g.length() != n) {
				flg = false;
			}


			for(int j=0;j<m;j++) {

				if(g.length() < s[j]) {
					flg = false;
				}else {
				if(Integer.valueOf(g.substring(s[j]-1,s[j])) != c[j]) {
					flg = false;
				}
			}
		}

		if(flg) {
			System.out.println(i);
			return;
		}
		}
		System.out.println(-1);

		scan.close();

	}

}
