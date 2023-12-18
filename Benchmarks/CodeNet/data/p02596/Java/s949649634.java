import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long k = scan.nextLong();
		long count = 1;
		long seven = 7;
		
		if(k % 2 == 0) {
			System.out.println(-1);
		}else {
			while(count<1000000) {
				if(seven % k == 0) {
					System.out.println(count);
					System.exit(0);
				}else {
					seven = seven * 10 + 7;
					count++;
				}
			}
			System.out.println(-1);
		}

	}

}
