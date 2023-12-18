import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		long[] kazu = new long[a];
		
		int nn = 0;
		int j = 1;
		
		for(int i=0;i<a;i++) {
			kazu[i] = scan.nextLong();
			if(kazu[i]==0) {
				j=0;
			}
		}
		
		
		if(j==0) {
			System.out.print(0);
		}
		else {
			long an = kazu[0];
			for(int i=1;i<a;i++) {
				an *= kazu[i];
				if(an>1000000000000000000L/1 || an<=0) {
					j = -1;
					i += a;
				}
			}
			if(j == -1) {
				System.out.print(-1);
			}
			else {
				System.out.print(an);
			}
		}
		
		
	}

}