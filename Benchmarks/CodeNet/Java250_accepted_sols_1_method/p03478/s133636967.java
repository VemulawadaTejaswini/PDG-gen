import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int[] n = new int[5];
		int res = 0;

		//System.out.printf("%d %d %d\n", N, A, B);

		for(int i = 1; i <= N; i++){
			int temp = i;
			int sum = 0;

			n[0] = temp / 10000;
			temp %= 10000;
			n[1] = temp / 1000;
			temp %= 1000;
			n[2] = temp / 100;
			temp %= 100;
			n[3] = temp / 10;
			temp %= 10;
			n[4] = temp;

			for(int j = 0; j < 5; j++) sum += n[j];
			if(sum >= A && sum <= B) res += i;
		}

		System.out.println(res);
	}
}
