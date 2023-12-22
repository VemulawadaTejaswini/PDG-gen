import java.util.*;

public class Main {
	public static void main(String[] args) {
		//ABC081A
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();

		long ac = a * c;
		long ad = a * d;
		long bc = b * c;
		long bd = b * d;

		long out = 0;

		if(ac > ad) out = ac;
		else out = ad;
		if(out < bc) out = bc;
		if(out < bd) out = bd;
		
		// 出力
		System.out.println(out);

		sc.close();
	}
}
