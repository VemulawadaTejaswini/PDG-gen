//パターン1：OK(小数点以下切り捨て)
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		BigDecimal wSide = new BigDecimal((double)len/3);
		BigDecimal tSide = new BigDecimal((double)len/3);
		BigDecimal hSide = new BigDecimal((double)len/3);

//		System.out.println(wSide);
//		System.out.println(tSide);
//		System.out.println(hSide);

		BigDecimal result = wSide.multiply(tSide).multiply(hSide);

		System.out.print(result);
		sc.close();
	}
}


//パターン2：OK(小数点以下6桁以降に桁落ちアリ)
//package ojt.AtCoder;
//import java.util.Scanner;
//public class TestC_159 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int len = sc.nextInt();
//
//		double wSide = (double)len/3;
//		double tSide = (double)len/3;
//		double hSide = (double)len/3;
//
//		System.out.println(wSide);
//		System.out.println(tSide);
//		System.out.println(hSide);
//
//		double result = wSide*tSide*hSide;
//
//		System.out.print(result);
//		sc.close();
//	}
//}


//パターン3：OK(小数点以下6桁以降に桁落ちアリ)
//package ojt.AtCoder;
//import java.util.Scanner;
//public class TestC_159 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double len = sc.nextDouble();
//
//		System.out.println(Math.pow(len/3 , 3));
//
//		sc.close();
//	}
//}
