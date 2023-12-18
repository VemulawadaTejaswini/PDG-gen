import java.util.Scanner;

public class Main {

	/*
	 * 0と1が両方とも残っているということは、どこかで隣り合っているはず。
	 * つまり、どちらか一方がすべて消えるまでしか処理は行えない。
	 * どちらか一方が消える　=　0と1のどちらか小さい個数に合わせる必要がある
	 * 消えるのはAとBの二つなので、ブロックの個数をそれぞれC0とC1と置くと
	 * Math.min(C0,C1)*2が答え 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int C0 = 0;
		int C1 = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '0') C0++;
			else C1++;
		}
		
		System.out.println(Math.min(C0, C1)*2
				);
	}

}
