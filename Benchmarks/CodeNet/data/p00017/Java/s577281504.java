import java.math.BigInteger;
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			String str=sc.nextLine();
			char[] c=str.toCharArray();
			for(int al=0;al<26;al++){
				for(int i=0;i<c.length;i++){
					if('a'<=c[i]&& c[i]<='z')c[i]=(char)((c[i]-'a'+1)%26+'a');
				}
				String s=String.copyValueOf(c);
				if(s.contains("the")|| s.contains("this") || s.contains("that")){
					break;
				}
			}
			ln(String.copyValueOf(c));
		}
	}

	public static String join(double[] array, String separator) {
		StringBuilder str = new StringBuilder(array[0] + "");
		for (int i = 1; i < array.length; i++) {
			str.append(separator).append(array[i] + "");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}