
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[1000000];
int i =0,c = 1;

		for(i=0;i<n;i++) {

			 a[i] = scan.nextInt();
		}


		if(a[i] == 0) {
			System.out.println(0);
		}

for(i=0;i<n;i++) {
	if(a[i]<=Math.pow(10, 18)/c) {
		c *= a[i];
	}else {
		System.out.println(-1);
	}
}


				System.out.println(c);




	}

}
