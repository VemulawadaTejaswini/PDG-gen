
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int plug=A;
		int ans=1;

		if(B==1) {
			ans=0;
			System.out.println(ans);
			return;
		}

		while(true) {
			if(B<=plug) {
				break;
			}
			plug+=A-1;
			ans++;
		}
		System.out.println(ans);
	}
}