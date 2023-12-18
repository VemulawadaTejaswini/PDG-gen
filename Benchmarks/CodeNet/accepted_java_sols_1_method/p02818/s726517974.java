import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			//受け取り
			//連結
			long takahashi = sc.nextLong();
			long aoki = sc.nextLong();
			long count = sc.nextLong();


			if( count >= takahashi + aoki) {
				takahashi = 0;
				aoki = 0;
			}else if( count > takahashi) {
				long tmp = count - takahashi;
				takahashi = 0;
				aoki = aoki - tmp;
			}else{
				takahashi = takahashi -count;
			}

			System.out.print(takahashi +" " + aoki);


		}
}

