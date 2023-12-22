import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),D=sc.nextInt();
		int ans=1;

		while(true) {
			if((2*D+1)<N) {
				ans++;
				N-=2*D+1;
			}else {
				break;
			}
		}
		System.out.println(ans);
	}
}