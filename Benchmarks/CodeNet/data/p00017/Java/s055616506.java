import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run() {
		while(sc.hasNext()) {
			String str = sc.nextLine();
			String[] spell = str.split(" ");
			spell[spell.length-1] = spell[spell.length-1].substring(0, spell[spell.length-1].length()-1);
			String[] dec = new String[spell.length];
			boolean flg = false;
			for(int i=1;i<26;i++) {
				for(int j=0;j<spell.length;j++) {
					dec[j] = trans(spell[j],i);
//					System.out.println(dec[j]);
					if(flg || dec[j].compareTo("the") == 0
					       || dec[j].compareTo("this") == 0 
					       || dec[j].compareTo("that") == 0) {
						flg = true;
					}
				}
				if(flg) break;
			}
			
			for(int i=0;i<dec.length-1;i++) {
				System.out.print(dec[i] + " ");
			}
			System.out.println(dec[dec.length-1] + ".");
			
		}
	}
	final int offset = 'a';
	String trans(String str, int n) {
//		System.out.println(str);
		char[] ret = str.toCharArray();
		String decode = "";
		for(int i=0;i<ret.length;i++) {
			ret[i] = (char)(offset + ( ret[i] - offset + n ) % 26);
			decode += ret[i];
		}
//		System.out.println(ret);
		
		return decode;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}