
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []c = sc.next().toCharArray();
		
		boolean flag = true;
		
		if(c.length% 2== 1) {
			System.out.println("No");
			return;
		}
		for(int i = 0 ;i < c.length ;i++) {
			if(i % 2 == 1) {
				continue;
			}
			if(c[i] != 'h' || c[i+1] != 'i') {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
