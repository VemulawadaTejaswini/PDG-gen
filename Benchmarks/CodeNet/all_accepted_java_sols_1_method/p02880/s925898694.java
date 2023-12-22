
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//intを受け取る
		int n = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i*j == n) {
					flag = 1;
					break;
				}
			}
		}
		if(flag == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
