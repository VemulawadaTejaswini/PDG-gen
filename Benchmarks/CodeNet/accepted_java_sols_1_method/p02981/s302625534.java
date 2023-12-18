import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		//train
		int train = N * A;
		
		if (train < B){
			System.out.println(train);
		
		}else{
			System.out.println(B);
		}
    }
}