import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] ch = scanner.next().toCharArray();
		int[] c = new int[n];  
		int[] d = new int[n];
		for(int i = 0; i < n; i++){
			if(i == 0) {
				c[0] = 0;
				d[0] = 0;		
			}
			if(i == n-1) {
				break;
			}else {
				if(ch[i] == 'W') {
					c[i+1] = c[i]+1;
				}else {
					c[i+1] = c[i];
				}
				if(ch[n-1-i] == 'E') {
					d[i+1] = d[i]+1; 
				}else{
					d[i+1] = d[i];
				}
			}
		}
		int ans = n;
		for(int r = 0; r < n; r++) {
			int tmp = c[r]+ d[n-1-r];
			if(tmp < ans) ans = tmp;
		}
		System.out.println(ans);
	}

}
