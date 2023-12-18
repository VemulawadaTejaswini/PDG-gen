import java.util.Arrays;
import java.util.Scanner;

class Main{

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
						int N = scanner.nextInt();
		//				int K = scanner.nextInt();

		int[] data = new int[N];
		for(int i = 0;i < N;i++){
			data[i] = scanner.nextInt();
		}
		Arrays.sort(data);
		int ans = 1;
		for(int i =0;i < N-1;i++){
			if(data[i] != data[i+1]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
