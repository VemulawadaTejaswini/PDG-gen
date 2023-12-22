import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long K = getK(A,B) ;
		if(K == null) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(K);
		}
	}

	public Long getK(Long A, Long B) {

		Long K = null ;
		if((A+B)%2 == 0 ) {
			K = (A + B)/2 ;
		}

		return K ;
	}

}
