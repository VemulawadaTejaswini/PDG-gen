import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		long a, b, m, n,tmp;

		while(scanner.hasNext()){
			a = m = scanner.nextInt();
			b = n = scanner.nextInt();
			if(m < n){
				tmp = m;
				m = n;
				n = tmp;
			}

			for(;;){
				if(n == 0) break;

				tmp = n;
				n = m % n;
				m = tmp;
			}

			System.out.println(m +" " + a * b / m);

		}
	}
}