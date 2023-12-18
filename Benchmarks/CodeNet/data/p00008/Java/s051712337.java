import java.util.Scanner;


public class Main {

	static int n;
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		while(read())	solve();
	}
	
	public static boolean read() {
		if(sc.hasNext()) {
			n = sc.nextInt();
			return true;
		} else {
			return false;
		}
	}
	public static void solve() {
		int ans = 0;
		for(int a=0 ; a<10 ; a++) {
			for(int b=0 ; b<10 ; b++) {
				for(int c=0 ; c<10 ; c++) {
					for(int d=0 ; d<10 ; d++) {
						if(a+b+c+d==n) ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}