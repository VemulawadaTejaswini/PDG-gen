package GlobalSign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void printPrimes(int no) {
		int cnt = 0;
		for(int i=2;i<=no;i++) {
			if(isPrime(i))
				cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] a) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
			if(str!=null)
				printPrimes(Integer.parseInt(str));
		}

	public static boolean isPrime(int no) {
		// TODO Auto-generated method stub
		int m = (int) Math.sqrt(no);
		boolean p = false;
		if(no ==2 || no ==3)
			p = true;
		for(int i=2;i<m;i++) {
			if(no%i==0)
				p = false;
			else
				p = true;
		}
		return p;
	}
}