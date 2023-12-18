import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long count = 0;
		for(int i = 0; i < n; i ++) {
			if(scan.nextInt() % 2 == 1 && i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);	
	}

}