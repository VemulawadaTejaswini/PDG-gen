import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), D = sc.nextInt(), X = sc.nextInt();
		int[] day = new int[N];
		int[] count = new int[N];
		for (int i=0; i<N; i++){
			day[i] = sc.nextInt();
			for (int j=1; j<=D; j+=day[i]){
				count[i]++;
			}
		}
		int ans = X;
		for (int i:count){
			ans += i;
		}
		System.out.println(ans);
		

	}

}