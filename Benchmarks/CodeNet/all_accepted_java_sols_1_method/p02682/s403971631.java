import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long count = 0;
		if(K <= A){
			count = K;
		}else{
			count = A;
			long num = K-A-B;
			if(num > 0){
				while(num > 0){
					count--;
					num--;
				}
			}
		}
		System.out.println(count);
	}
}