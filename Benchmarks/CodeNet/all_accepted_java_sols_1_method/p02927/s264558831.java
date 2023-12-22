
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();
		int k = D/10;
		int ans = 0;
		for(int m = 1; m<=M;m++ ) {
			for(int j = 2; j <=k; j++) {
				for(int i = 2; i <=9; i++) {

					if((i*j == m) &&((j*10+i)<=D)) {
						//System.out.println(m+"="+i+"*"+j);
						ans++;
					}
				}
			}
		}
		System.out.println(ans);

	}

}
