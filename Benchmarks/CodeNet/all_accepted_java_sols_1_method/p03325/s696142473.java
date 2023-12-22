import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			while (x > 0 && x % 2 == 0) {
				count++;
				x /= 2;
			}
		}
		System.out.println(count);
	}
}
