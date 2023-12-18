import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = 1;
		int count =0;
		for(int i = 1; i <= n; i++) {
			int divi = i;
			int roop = 0;
			while(divi % 2 == 0) {
				divi = divi/2;
				roop++;
			}
			if(count < roop) {
				count = roop;
				ans = i;
			}
		}
		System.out.println(ans);
	}
}