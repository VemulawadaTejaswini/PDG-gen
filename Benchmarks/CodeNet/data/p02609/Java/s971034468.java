import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();

		for (int i=0; i<s.length(); i++){

			StringBuffer sb = new StringBuffer(s);

			if (sb.charAt(i) == '0'){
				sb.setCharAt(i, '1');
			} else {
				sb.setCharAt(i, '0');
			}
			int dec = Integer.parseInt(sb.toString(), 2);
			System.out.println(f(dec));
		}



	}

	public static int popcount(int n){

		String bin = Integer.toBinaryString(n);
		int ret = 0;

		for (int i=0; i<bin.length(); i++){
			if (bin.charAt(i) == '1'){
				ret ++;
			}
		}
		return ret;
	}

	public static int f(int n){

		int ret = 0;
		while (n > 0) {
			n = n % popcount(n);
			ret++;
		}
		return ret;
	}
}