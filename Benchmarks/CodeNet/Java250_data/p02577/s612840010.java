import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		String[] array = n.split("");

		long tmp = 0L;

		for(String str : array) {
			tmp = tmp+Integer.parseInt(str);
			tmp = tmp%9;
		}

		if(tmp%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


//		BigDecimal aa = new BigDecimal("10");
//		BigDecimal zero = new BigDecimal("0");
//		BigDecimal tmp = aa;
//
//		BigDecimal bigN = new BigDecimal(n);
//
//		while(tmp.compareTo(bigN)==-1) {
//			tmp = tmp.multiply(aa);
//		}
//
//		tmp = tmp.divide(aa);
//		System.out.println(tmp);
//
//		while(bigN.compareTo(zero)==1) {
//			bigN = bigN.subtract(tmp);
////			tmp = tmp.multiply(aa);
////			System.out.println(bigN);
//		}
//		bigN = bigN.add(tmp);
//		System.out.println(bigN);




	}
}
