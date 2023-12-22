import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		//ArrayList<Integer> numArray = new ArrayList<>();
		long numArray[] = new long[N];

		long ans1 = 0,ans2 = 0,up=0,down=0;
		for(int i = 0; i < N; i++){
			numArray[i] = sc.nextLong() - i;
			}

		Arrays.sort(numArray);
		up = numArray[N/2];
		down = numArray[(N-1)/2];

		for(int i = 0; i < N; i++){
			ans1 += Math.abs(numArray[i]-up);
			ans2 += Math.abs(numArray[i]-down);
		}

		System.out.println(Math.min(ans1, ans2));
		sc.close();

	}

}
