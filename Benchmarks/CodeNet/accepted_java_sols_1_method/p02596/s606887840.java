import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long K = scan.nextLong();

			long s = 7%K;
			long count =1;

			if(s==0) {
				System.out.println(count);
				return;
			}

			//ここからは奇数のみ。
			while(true) {
				s = ((10*s)%K+7)%K;
				count++;
				if(s==0)break;
				if(count==1000500) {
					count = -1;
					break;
				}
			}

			System.out.println(count);

		}
	}
}
