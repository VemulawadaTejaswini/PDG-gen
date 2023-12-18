import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String A = Integer.toString(a);
		String B = Integer.toString(b);

		String AtimesB = "";
		for(int i = 0; i < b; i++){
			AtimesB += A;
		}

		String BtimesA = "";
		for(int i = 0; i < a; i++){
			BtimesA += B;
		}
		String result = "";
		if(AtimesB.compareTo(BtimesA) < 0){
			result = AtimesB;
		}else{
			result = BtimesA;
		}
		System.out.println(result);
	}
}
