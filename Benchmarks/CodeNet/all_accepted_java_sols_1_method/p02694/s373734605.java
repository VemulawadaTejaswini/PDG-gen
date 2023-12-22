import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long num = 100;
		long cnt = 0;
		
		while(num < X) {
			num = num+(num / 100);
			cnt += 1;
		}
					
			System.out.println(cnt);
		sc.close();
	}
}