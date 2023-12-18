import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		long result = 0;
		long max = (long) Math.pow(10,N);
		long limit = (long) Math.pow(N,10)+7;
		for(long i=0;i < max;i++) {
			String tmp = String.valueOf(i);
			if((tmp.length() < N || tmp.contains("0")) && tmp.contains("9")) {
				result++;
				if(result == limit) {
					result = 0;
				}
			}
		}

		System.out.println(result);

	}

}