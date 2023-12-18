import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int K = cin.nextInt();
		boolean[] num = new boolean[10];
		Arrays.fill(num, true);
		for(int i=0;i<K;i++){
			num[cin.nextInt()] = false;//这些数字是不可用的 
		}
		while (true) {
			int dummpN = N;
			boolean flag = false;
			while (dummpN != 0) {
				int temp = dummpN%10;
				dummpN /=10;
				if (!num[temp]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(N);
				return;
			}
			N++;
		}
		
	} 
	
}
