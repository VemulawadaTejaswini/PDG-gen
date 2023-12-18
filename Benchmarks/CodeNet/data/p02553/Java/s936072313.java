import java.util.*;

public class Main {
	public static void main(String[] args) {
		//ABC081A
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int ac = a * c;
		int ad = a * d;
		int bc = b * c;
		int bd = b * d;

		int out = 0;

		if(ac > ad) out = ac;
		else out = ad;
		if(out < bc) out = bc;
		if(out < bd) out = bd;
		
		// 出力
		System.out.println(out);

		sc.close();
	}
}
