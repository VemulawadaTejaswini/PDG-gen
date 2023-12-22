import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long N = sc.nextLong();
		long D = sc.nextLong();
		long count = 0;
		for(int i =0;i<N;i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			double value = Math.sqrt(Math.abs(a)*Math.abs(a)+Math.abs(b)*Math.abs(b) );
			if(value<=D) {
				count = count + 1;
			}
		}
		System.out.println(count);

	}

}
