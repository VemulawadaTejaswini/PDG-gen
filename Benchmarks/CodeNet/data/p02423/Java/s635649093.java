import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			// 何故かintにすると一部表記が狂うようでクリアできない
			// (Integer.parseUnsignedInt使用)
			long x = sc.nextLong();

			System.out.println(toPaddedBinaryString(x));
			System.out.println(toPaddedBinaryString(~x));
			System.out.println(toPaddedBinaryString(x<<1));
			System.out.println(toPaddedBinaryString(x>>1));
		}
	}
	/**
	 * 0パディングするのである
	 * @param bin バイナリするlong
	 * @return
	 */
	public static String toPaddedBinaryString(long bin) {
		String result = String.format("%32s", Long.toBinaryString(bin)).replaceAll(" ", "0");
		if(result.length()>32)
			return result.substring(result.length()-32);
		return result;
	}
}
