import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong(),m = scanner.nextLong();
		if(n * 2 > m){
			System.out.println(m / 2);
		}else{
			long piece = n;
			m -= n * 2;
			System.out.println(n + (m / 4));
		}
	}

}
