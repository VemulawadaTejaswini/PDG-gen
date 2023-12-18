import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = Long.parseLong(sc.next());
		Long B = Long.parseLong(sc.next());
		Long C = Long.parseLong(sc.next());
		Long K = Long.parseLong(sc.next());
		sc.close();
		
		long count = 0;
		if(K - A <= 0) {
			count = count + 1 * K;
		}else {
			count += A;
			if(K - (A + B) <= 0) {
				
			}else {
				long cNum = K - (A + B);
				count -= cNum;
			}
		}
		System.out.println(count);

	}

}