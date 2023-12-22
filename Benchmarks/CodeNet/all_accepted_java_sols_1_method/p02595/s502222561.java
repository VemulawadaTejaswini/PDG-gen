import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextLong();
		int ret = 0;
		for(int i = 0 ; i < N ; ++i){
			long x = sc.nextLong();
			long y = sc.nextLong();
			long dist = x * x + y * y;
			if(dist <= D * D){
				++ret;
			}
		}
		System.out.println(ret);
	}
}
