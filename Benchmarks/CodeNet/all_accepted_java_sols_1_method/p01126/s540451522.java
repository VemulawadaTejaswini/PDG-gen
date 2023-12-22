import java.util.Scanner;

/**
 * Amida, the City of Miracle
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=2001
 *
 * @author Igari Kazuya
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n,m,a;
			n = sc.nextInt();
			m = sc.nextInt();
			a = sc.nextInt();

			if(n==0&&m==0&&a==0){
				break;
			}

			int[][] map = new int[1001][n];

			int[][] load = new int[m][3];
			for(int i=0;i<m;i++){
				load[i][0] = sc.nextInt();
				load[i][1] = sc.nextInt();
				load[i][2] = sc.nextInt();
			}

			for(int i=1001;i>0;i--){
				for(int j=0;j<m;j++){
					if(load[j][0] == i){
						if(a==load[j][1]){
							a=load[j][2];
						}else if(a==load[j][2]){
							a=load[j][1];
						}
					}
				}
			}
			System.out.println(a);
		}
	}

}