import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] B = new int[100001];
		for(int i = 1 ; i <= N ; i++){
			int tmp  = sc.nextInt();
			if(tmp == 0){
				B[tmp]++;
				B[tmp+1]++;
			}
			else {
				B[tmp-1]++;
				B[tmp]++;
				B[tmp+1]++;
			}
		}
		sc.close();

		int ans = 0;
		for(int i = 0 ; i <= 100000 ; i++){
			ans = Math.max(ans, B[i]);
		}
		System.out.println(ans);

	}
}
