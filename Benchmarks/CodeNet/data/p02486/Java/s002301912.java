import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		for(;;){
			int counter = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && x == 0) {
				break;
			}
			for(int i = 1; i <= n - 2; i++) {
				for(int j = i + 1; i <= n-1; j++) {
					for(int k = j + 1; k <= n; k++) {
						System.out.println(i+" "+j+" "+k);
						if(i + j + k == x) {
							counter++;
						}
					}
				}
			}
			System.out.println(counter);
		}

	}

}