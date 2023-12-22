import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		int ans = 1;
		System.out.println();
		H[0] = sc.nextInt();
		int flg = H[0];
		for(int i = 1;i<N;i++){
			H[i]= sc.nextInt();
			if(flg<=H[i]){
				flg = H[i];
 				ans++;
			}
		}
		System.out.println(ans);
	}
}