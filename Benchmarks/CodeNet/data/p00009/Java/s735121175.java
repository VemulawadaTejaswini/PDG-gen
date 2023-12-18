package GlobalSign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] a) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
		int count = 0;
			if(str!=null) {
				int no = Integer.parseInt(str);
				for(int i=2;i<no;i++) {
					if(isPrime(i))
						count++;
				}
			}
			System.out.println(count);
		}

	public static boolean isPrime(int no) {
		// TODO Auto-generated method stub
		boolean p = false;
		if (no == 2)
			p = true;
		else {
			for(int i=0;i<=(Math.sqrt(no));i++) {
				if(no%i==0)
					p = false;
				else 
					p = true;
			}
		}
		return p;
	}
}