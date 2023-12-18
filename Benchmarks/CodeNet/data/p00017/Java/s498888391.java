import java.math.*;
import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\\n");
		while(in.hasNext()){
			String str = in.next();
			char[] s = str.toCharArray();
			for(int shift=0; shift<26; shift++){
				for(int i=0; i<s.length; i++){
					if(Character.isLowerCase(s[i])){
						s[i] = (char)(((int)s[i]-(int)'a'+1)%26 + (int)'a');
					}
				}
				str = new String(s);
				if(str.indexOf("the")!=-1
					|| str.indexOf("this")!=-1
					|| str.indexOf("that")!=-1)
					break;
			}
			System.out.println(new String(s));
		}
	}

}