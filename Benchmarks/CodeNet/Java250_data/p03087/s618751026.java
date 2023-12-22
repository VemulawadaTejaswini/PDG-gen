import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String ss = sc.next();
		int[] l = new int[Q];
		int[] r = new int[Q];

		for(int i = 0;i < Q;i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int[] ruisekiwa = new int[N+1];
		ruisekiwa[0] = 0;
		for(int i = 0;i < N-1;i++){
			if(ss.charAt(i) == 'A' && ss.charAt(i+1) == 'C'){
				ruisekiwa[i+1] = ruisekiwa[i] + 1;
			}else{
				ruisekiwa[i+1] = ruisekiwa[i];
			}
		}
		
		
		int[] ans = new int[Q];

		for(int i = 0;i < Q;i++){
			int count = 0;
			ans[i] = ruisekiwa[r[i]-1] - ruisekiwa[l[i]-1];
		}

		for(int i = 0;i < Q;i++){
			System.out.println(ans[i]);
		}


	}


}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


