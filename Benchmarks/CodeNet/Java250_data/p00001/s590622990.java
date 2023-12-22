import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hills = new int[10];
		
		int cnt = 0;
		while(cnt < 10) {
			int hill = Integer.parseInt(scan.next());
			if(hill >= 0 && hill <= 10000) {
				hills[cnt] = hill;
				cnt++;
			} else {
				continue;
			}
		}
		
		for(int i = 0; i < hills.length - 1; i++) {
			for(int j = hills.length - 1; j > i; j--) {
				if(hills[j] > hills[j - 1]) {
					int tmp = hills[j];
					hills[j] = hills[j - 1];
					hills[j - 1] = tmp;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(hills[i]);
		}
		
	}
}