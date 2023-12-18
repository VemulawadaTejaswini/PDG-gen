import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			int[] b = new int[N];
			for(int i = 0; i < N;i++){
				b[i]=cin.nextInt();
			}
			Arrays.sort(b);
			int[] sum = new int[N-1];
			int sumsum=0;
			for(int i = 0; i < N-1;i++){
				if(i==0){
					sum[i]=b[i];
				}
				else{
					sum[i]=sum[i-1]+b[i];
				}
				sumsum+=sum[i];
			}
			System.out.println(sumsum);
		}
	}
}