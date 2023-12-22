import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		
		int[][] X = new int[N][D];
		for(int i=0;i<N;i++) {
			for(int p=0;p<D;p++) {
				X[i][p] = sc.nextInt();
			}
		}
		
		int count = 0;
		for(int i=0;i<N;i++) {
			for(int p=i+1;p<N;p++) {
				double total = 0;
				for(int d =0;d<D;d++) {
					double a =Math.pow(X[i][d] - X[p][d],2); 
					total += a;
				}
				total = Math.sqrt(total);
				if(total % 1 == 0) {
					count ++;
				}
			}
		}
		System.out.println(count);	
		sc.close();	
	}
}