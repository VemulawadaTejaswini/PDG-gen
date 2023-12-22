import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
	int N = sc.nextInt();
	int X = sc.nextInt();
	int[] m = new int[N];
	int ans = N;
	for(int i = 0;i < N;i++){
		m[i] = sc.nextInt();
		X -= m[i];
	}
	Arrays.sort(m);
	if(X == 0){
		System.out.println(ans);
		return;

	}
	while(X>=0){
		X -= m[0];
		ans++;
	}
	

System.out.println(ans-1);


	}

	static long comb(int n,int r){
		long ue = 1;
		for(int i = 0;i < r;i++){
			ue *= n-i;
		}
		long sita = 1;
		for(int i = 1;i <= r;i++){
			sita *= i;
		}
		return ue/sita;


	}





}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



