import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long A = scan.nextInt();
		long B = scan.nextInt();
		long C = scan.nextInt();

		long[] length = {A,B,C};

		long ans;

		if(A%2==0|B%2==0|C%2==0){
			ans =0;
		}else{
			Arrays.sort(length);
			ans =0L+ length[0]*length[1];
		}
		System.out.println(ans);
	}

}
