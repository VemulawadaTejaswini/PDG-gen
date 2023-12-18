import java.util.Scanner;

public class Main {

	public static void main(String... args) throws Exception {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println(to26Str(scn.nextLong()));
		}
		/*
		for(int i=17576; i<=(17576) + 26*26 + 26*2; i++) {
			System.out.println(i + ": " + to26Str(i));
		}
		*/
	}
	// zを0、aを1に割り当てる
	static final char[] chars = "zabcdefghijklmnopqrstuvwxy".toCharArray();
	static final int radix = chars.length;

	public static String to26Str(long num) {
		StringBuilder sb = new StringBuilder();
		do {
			sb.append(chars[(int)(num % radix)]);
			num = (num-1) / radix;	// 0(z)のとき桁上りしない
		} while(0 < num);

		return sb.reverse().toString();
	}

}
