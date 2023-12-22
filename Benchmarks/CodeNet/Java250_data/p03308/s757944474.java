import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

		long a = 0;

		for(int i = 0;i<N;i++){
			a = sc.nextLong();
			if(a < min){
				min = a;
			};
			if(a > max){
				max = a;
			};
		}
		System.out.println(max - min);
	}
}