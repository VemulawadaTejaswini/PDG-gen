import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		long result = 0;
		long limit = (long) Math.pow(10,N);
		for(long i=0;i < limit;i++) {
			String tmp = String.valueOf(i);
			if((tmp.length() < N || tmp.contains("0")) && tmp.contains("9")) {
				result++;
				if(result == (long) Math.pow(N,10)+7) {
					result = 0;
				}
			}
		}

		System.out.println(result);

	}

}