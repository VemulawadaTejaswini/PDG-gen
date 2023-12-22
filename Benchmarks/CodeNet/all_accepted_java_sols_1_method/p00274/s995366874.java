import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int[] k = new int[10000];
			while(true) {
				int n,cnt = 0;
				n = scan.nextInt();
				String check = "no";
				if(n == 0) break;
				for(int i = 0; i < n; i++) {
					k[i] = scan.nextInt();
					if(k[i] >= 1) cnt++;
					if(k[i] >= 2) check = "Yes";
				}
				if(check != "Yes") {
					System.out.println("NA");
				} else {
					System.out.println(cnt + 1);
				}
			}
	}
}