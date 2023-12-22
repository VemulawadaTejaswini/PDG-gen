import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		for (int i=0;i<=N&&i*10000<=Y;i++ ) {
			int now = Y -i *10000;
			for (int j=0;j+i<=N &&j*5000<=now;j++) {
				int temp = now -j *5000;
				if (temp %1000==0 &&j+i+temp/1000==N) {
					System.out.println(i+" "+j+" "+temp/1000);
					return ;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}