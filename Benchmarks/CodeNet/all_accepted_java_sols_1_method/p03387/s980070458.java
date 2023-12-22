import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] Aa = new int[3];
		for (int i = 0; i < 3; i++) {
			Aa[i] = scn.nextInt();
		}
		Arrays.sort(Aa);
		int A = Aa[0], B = Aa[1], C = Aa[2];
		int ans = 0;
		ans += (C - A) / 2;
		A += ((C - A) / 2) * 2;
		ans += (C - B) / 2;
		B += ((C - B) / 2) * 2;
		Aa[0] = A;
		Aa[1] = B;
		Aa[2] = C;
		Arrays.sort(Aa);
		for(int i = 2;i >= 0;i--) {
			Aa[i] -= Aa[0];
		}
		
		if(Aa[0] == Aa[1]) {
			if(Aa[2] != 0)ans++;
		}else {
			ans +=2;
		}
		System.out.println(ans);
		
	}

}
