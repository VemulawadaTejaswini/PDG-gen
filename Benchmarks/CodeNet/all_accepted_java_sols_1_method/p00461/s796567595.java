import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int m = sc.nextInt();
			char[] s = sc.next().toCharArray();
			int ioi = 0;
			int ans = 0;
			for(int i=0;i<m;i++) {
				if (ioi % 2 == 0 && s[i] == 'I') {
					ioi++;
					if (ioi/2 >= n) {
						ans++;
					}
				}else if(ioi % 2 == 1 && s[i] == 'O') {
					ioi++;
				}else{
					if (s[i] == 'I') {
						ioi = 1;
					}else{
						ioi = 0;
					}
				}
			}
			System.out.println(ans);
		}
	}

}