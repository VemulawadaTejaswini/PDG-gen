
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long Y = in.nextLong();
		Boolean flag = true;
		for(int i=0;i<=N;i++) {
			for(int j=0;j<=N-i;j++) {
				Long ans=10000*i+5000*j+1000*(N-i-j);
				if(ans==Y) {
					System.out.println(String.format("%d %d %d",i ,j,(N-i-j)));
					flag= false;
					break;
				}

			}
			if(!flag) {
				break;
			}
		}
		if(flag) {
			System.out.println("-1 -1 -1");
		}
		
	}
}