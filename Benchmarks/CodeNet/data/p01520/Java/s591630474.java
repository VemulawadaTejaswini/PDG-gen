import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int E = sc.nextInt();
		int[] x = new int[N];
		int a = 0;
		
		for(int i=0; i<N;i++) {
			x[i] = sc.nextInt();
		}

		for(int i=T-E; i<T+E; i++) {
			if (a == 1) {
				break;
			}
			for(int j=0; j<N; j++) {
				if(i % x[j] ==0){
					System.out.println(j);
					a = 1;
					break;
				}else {
					a = 2;
				}
			}
		}
		if(a ==2) {
			System.out.println("-1");
		}
	}
}

