import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		for (int i=1 ; i<=n ; i++) {
			int x=i;
			while(true) {
				if (x==0) {
					break;
				}
				if (x%3==0 || x%10==3) {
					System.out.printf(" "+i);
					break;
				}
				x/=10;
			}
		}
		sc.close();
	}

}

