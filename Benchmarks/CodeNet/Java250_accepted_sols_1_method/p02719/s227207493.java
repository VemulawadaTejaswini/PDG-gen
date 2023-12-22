import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long K = scan.nextLong();
		long result = 0;

			if(N%K==0) {
			result = 0;
		}else {
			if(N%K<K-N%K) {
				result = N%K;
			}else {
				result = K-N%K;
			}
		}
		System.out.println(result);
	}
}