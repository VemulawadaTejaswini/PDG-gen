import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		
		int cnt = 1;
		while(true) {
			boolean flg = true;
			int N = s.length-cnt;
			if (N%2 == 0){
				for (int i=0; i<N/2; i++) {
					if (s[i] != s[i+N/2]) {
						flg = false;
						break;
					}
				}
				if (flg == true) {
					System.out.println(N);
					return;
				}
			}
			cnt++;
		}
	}
}
