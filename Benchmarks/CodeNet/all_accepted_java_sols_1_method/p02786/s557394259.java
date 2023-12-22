import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		sc.close();
		long cnt = 0;
		while(H > 0){
			H /= 2;
			cnt++;
		}
		System.out.println((long)Math.pow(2, cnt) - 1);

	}

}