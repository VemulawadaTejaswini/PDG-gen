import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		int count = 0;
		int z = 0;
		int p = 0;
		int sousa = 0;
		long x = N;
		
		for(int i=2; i<=N;) {
			if(x % i == 0) {
				x /= i;
				count++;
			}
			else {
				i++;
			}
		}
		
		if(count == 1) {
			count = 0;
		}
		
		System.out.println(count);
	}
}