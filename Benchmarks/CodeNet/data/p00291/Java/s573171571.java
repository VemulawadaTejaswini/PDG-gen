import java.util.Scanner;

class AOJ0296 {
	public static void main(String[] args){
		final int[] table = {1, 5, 10, 50, 100, 500};
		Scanner sc = new Scanner(System.in);
		
		int[] buf = new int[6];
		for (int i = 0; i < buf.length; i++){
			buf[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < buf.length; i++){
			sum += buf[i] * table[i];
		}
		
		if (sum >= 1000){
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}