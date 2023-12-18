import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		if(K > (N-1)*(N-2)/2) {
			System.out.println(-1);
		}else {
			int p = (N-1)*(N-2)/2 - K;
			System.out.println(N-1+p);
			for(int i = 2;i <= N;i++) {
				System.out.println(1 + " " + i);
			}
			int count = 0;
			for(int i = 2;i < N;i++) {
				for(int j = 1+i; j <= N;j++) {
					if(count == p)break;
					System.out.println(i + " " + j);
					count++;
				}
			}
		}
	}

}
