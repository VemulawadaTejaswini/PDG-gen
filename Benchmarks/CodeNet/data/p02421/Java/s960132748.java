import java.util.Scanner;

enum Type{
	SAME,
	A_BIG,
	B_BIG
};

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String TARO,HANAKO;
		int score_TARO = 0,score_HANAKO = 0;

		for(int loop = 0; loop < N; loop++){

			TARO = scanner.next();
			HANAKO = scanner.next();

			switch(compString(TARO,HANAKO)){
			case SAME:
				score_TARO += 1;
				score_HANAKO += 1;
				break;
			case A_BIG:
				score_TARO += 3;
				break;
			case B_BIG:
				score_HANAKO += 3;
				break;
			}
		}

		System.out.printf("%d %d\n", score_TARO,score_HANAKO);
	}

	//A基準で比較する関数
	public static Type compString(String A,String B){
		int a_index = 0,b_index = 0;

		while(a_index < A.length() && b_index < B.length() && A.charAt(a_index) == B.charAt(b_index)){
			a_index++;
			b_index++;
		}

		if(a_index < A.length() && b_index < B.length()){
			if(A.charAt(a_index) > B.charAt(b_index)){
				return Type.A_BIG;
			}else{
				return Type.B_BIG;
			}

		}else if(a_index < A.length() && b_index == B.length()){
			return Type.A_BIG;
		}else if(a_index == A.length() && b_index < B.length()){
			return Type.B_BIG;
		}else{
			return Type.SAME;
		}
	}
}
