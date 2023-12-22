import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		
		for(int i= 0; i < N ;i++) { 
			d[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i =0; i < N-1 ; i++ ) {
			for(int j = 0; j < N; j++) {
				if(j==i) {
					continue;
				}else if(i>j){
					continue;
				}else {
					sum += d[i]*d[j];
				}
			}
		}
		System.out.println(sum);
	}
}