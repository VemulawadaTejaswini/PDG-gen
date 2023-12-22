import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			String []t = s.split("[+,=]");
			BigInteger[] bi = new BigInteger[3];
			boolean flag0 = true;
			for(int i = 0; i <= 9; i++) {
				boolean flag = true;
				for(int j = 0; j < 3; j++) {
					String k = t[j];
					if(i == 0 && k.charAt(0) == 'X' && k.length() != 1) {
						flag = false;
						break;
					}else {
						k = k.replaceAll("X", Integer.toString(i));
						bi[j] = new BigInteger(k);
					}
				}
				if(flag) {
					if(bi[2].equals(bi[0].add(bi[1]))) {
						System.out.println(i);
						flag0 = false;
						break;
					}
				}
			}
			if(flag0) {
				System.out.println("NA");
			}
		}
		sc.close();
	}
}
