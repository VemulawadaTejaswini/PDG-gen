import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean ans;
	void run() {
		while(sc.hasNext()) {
			ans = false;
			String str = sc.nextLine();
			String[] spell = str.split(" ");
			String[] dec = new String[spell.length];
			boolean flg = false;
			for(int i=1;i<26;i++) {
				for(int j=0;j<spell.length;j++) {
					dec[j] = trans(spell[j],i);
//					System.out.println(dec[j]);
					if(ans) {
						flg = true;
					}
				}
				if(flg) break;
			}
			
			for(int i=0;i<dec.length-1;i++) {
				System.out.print(dec[i] + " ");
			}
			System.out.println(dec[dec.length-1]);
			
		}
	}
	final int offset = 'a';
	String trans(String str, int n) {
//		System.out.println(str);
		char[] ret = str.toCharArray();
		String decode = "";
		boolean flg = false;
		for(int i=0;i<ret.length;i++) {
			if(ret[i] == '.') {flg = true; break;}
			ret[i] = (char)(offset + ( ret[i] - offset + n ) % 26);
			decode += ret[i];
		}
		if(decode.compareTo("the") == 0
			       || decode.compareTo("this") == 0 
			       || decode.compareTo("that") == 0) {
			ans = true;
		}
//		System.out.println(ret);
		if(flg) decode += ".";
		
		return decode;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}