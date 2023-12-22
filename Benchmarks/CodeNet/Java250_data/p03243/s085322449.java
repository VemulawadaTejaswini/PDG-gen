import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;




	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int	x = sc.nextInt();
		for(int i = x;i <= 999;i++){
			if(i == 111 || i == 222 || i == 333 || i== 444 || i == 555 || i == 666|| i == 777 || i== 888 || i == 999){
				System.out.println(i);
				return;
				

			}
		}

	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

