import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(true) {
			if((n = sc.nextInt()) == 0) {
				break;
			}
			int ascore = 0, bscore = 0;
			for(int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a > b) ascore += a + b;
				else if(a < b) bscore += a + b;
				else {
					ascore += a;
					bscore += b;
				}
			}
			System.out.printf("%d %d\n", ascore, bscore);
		}
	}
}