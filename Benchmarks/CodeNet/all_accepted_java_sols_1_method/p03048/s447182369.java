import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		long ans = 0;
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= N; j++) {
				if(R*i+G*j <= N && (N-(R*i+G*j)) % B == 0)
					ans++;
			}
		}
		System.out.println(ans);

	}

}