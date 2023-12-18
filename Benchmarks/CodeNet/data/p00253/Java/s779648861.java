import java.util.Scanner;
public class Main {
	//--- 添字kの数字を排除した配列を作成 ---//
	static int[] copy(int[] h, int key) {
		int[] c = new int[h.length-1];
		int to = 0;
		for(int i = 0; i < h.length; i++) {
			if(i == key) {
				to = 1;
				continue;
			}
			c[i-to] = h[i];
		}
		return c;
	}
	
	//--- 等差check ---//
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int[] h = new int[n+1];
			for(int i = 0; i < n+1; i++) {
				h[i] = stdIn.nextInt();
			}
			//--- 等差check ---//
			In:for(int i = 0; i < n+1; i++) {
				int[] c = copy(h,i);
				for(int j = 0; j < c.length-2; j++) {
					if(c[j+1] - c[j] != c[j+2] - c[j+1]) {
						continue In;
					}
				}
				System.out.println(h[i]);
			}
		}
		
	}

}