

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		geta = new long[14];
		for(int i = 0; i < geta.length; i++){
			geta[i] = (long)Math.pow(26, i);
			if(i >= 1){
				geta[i] += geta[i - 1];
			}
//			System.out.println(geta[i]);
		}
		int len = 0;
		for(int i = geta.length - 1; i >= 0; i--){
			if(n >= geta[i]){
				len = i + 1;
				break;
			}
		}

		n -= geta[len - 1];

		String result = "";
		while(true){
			result = (char)(n % 26 + 'a') + result;
			n /= 26;

			if(n == 0){
				break;
			}
		}

		while(result.length() < len){
			result = "a" + result;
		}
		System.out.println(result);
//		geta = new long[14];
//		for(int i = 0; i < geta.length; i++){
//			geta[i] = (long)Math.pow(26, i);
//			if(i >= 1){
//				geta[i] += geta[i - 1];
//			}
//			System.out.println(geta[i]);
//		}
//
//
//		System.out.println(solve(n));

//		if(n == 0){
//			System.out.println('a');
//			return;
//		}
//
//		String name = "";
//		while(n > 0){
//			char tmp = (char)(n%26 + 'a' - 1);
//			if(n%26 == 0){
//				tmp = 'z';
//			}
//			name = tmp + name;
//
//			n /= 26;
//		}
//
//		System.out.println(name);
	}

	static long[] geta;
	static String solve(long num){
		if(num <= 26){
			return (char)(num + 'a' - 1) + "";
		}

		int len = 0;
		for(int i = geta.length - 1; i >= 0; i--){
			if(num >= geta[i]){
				len = i + 1;
				break;
			}
		}
		System.out.println(len);

		String result = (char)(num / (geta[len - 1] - 1) + 'a')+"";// + solve(num % geta[len - 1] - 1);

		return result;
	}
}