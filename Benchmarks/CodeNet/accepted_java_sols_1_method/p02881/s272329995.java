import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long N = sc.nextLong(),
				x = 1,
				y = 1,
				max_p=2;
		boolean f=false;
		for(int i=1;i<=(long)Math.pow(N, 0.5);i++) {
			if(N%i==0) {
				max_p = i;
				f=true;
			}
		}
		x=max_p-1;
		y=N/max_p-1;
		System.out.println(f?x+y:N-1);
	}
}