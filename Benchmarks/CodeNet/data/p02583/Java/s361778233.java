import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];

		for(int i=0;i<N;i++) {
			L[i] = sc.nextInt();
		}
		sc.close();

		if(N<3) {
			System.out.println(0);
			return;
		}

		int result = 0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					if(judge(L[i],L[j],L[k])) {
						result++;
					}
				}
			}
		}

		System.out.println(result);

	}

	public static boolean judge(int x,int y,int z) {
		if(x == y || x == z || y == z ) {
			return false;
		}

		if(x > y && x > z && y + z > x ) {
			return true;
		}

		if(y > z && y > x && x + z > y ) {
			return true;
		}

		if(z > x && z > y && x + y > z ) {
			return true;
		}

		return false;

	}

}