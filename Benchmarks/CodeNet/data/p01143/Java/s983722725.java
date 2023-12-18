import java.util.Arrays;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final int P = sc.nextInt();
			
			if(N == 0 && M == 0 && P == 0){
				break;
			}
			
			final double PER = (100 - P) / 100.0;
			
			int[] count = new int[N];
			int sum = 0;
			
			for(int i = 0; i < N; i++){
				count[i] = sc.nextInt();
				sum += count[i];
			}
			
			if(count[M-1] == 0){
				System.out.println("0");
			}else{
				double money = sum * 100.0;
				money *= PER;
				
				System.out.println((int)(money / count[M-1]));
			}
		}
		
	}

}