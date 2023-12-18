
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		
		int p = 7%k;
		
		if((k % 10) % 2 == 0) {
			System.out.println(-1);
		}
		if((k%10)== 5) {
			System.out.println(-1);
		}
		
		long cnt = 1;
		
		while(true) {
			if(p == 0) {
				break;
			}
			cnt++;
			p = (p*10+7)%k;
		}
		System.out.println(cnt);
	}
}
