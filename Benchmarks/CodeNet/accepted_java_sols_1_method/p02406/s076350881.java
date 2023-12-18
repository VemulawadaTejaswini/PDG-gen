import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		
		for (int i=1 ; i<=n ; i++) {
			//System.out.printf("");
			int x=i;
			
			if (x%3==0) {
				System.out.printf(" "+i);
			}else {
				while(true) {
					if (x==0) {
						break;
					}
					if (x%10==3) {
						System.out.printf(" "+i);
						break;
					}
					x/=10;
				}
			}
		}
		System.out.printf("\n");
	}

}

