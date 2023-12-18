import java.util.*;
import java.text.*;

public class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		TreeSet<String> set = new TreeSet<String>();
		int n = in.nextInt();
		for(int q=0; q<n; q++){
			String str = in.next();
			char[] ch = str.toCharArray();
			for(int i=1; i<str.length(); i++){
				char[] frag1 = new char[i];
				char[] frag2 = new char[i];
				char[] frag3 = new char[str.length()-i];
				char[] frag4 = new char[str.length()-i];
				for(int j=0; j<i; j++){
					frag1[j] = ch[j];
					frag2[j] = ch[i-1-j];
				}
				for(int j=0; j<str.length()-i; j++){
					frag3[j] = ch[i+j];
					frag4[j] = ch[str.length()-1-j];
				}
				String str1 = String.valueOf(frag1);
				String str2 = String.valueOf(frag2);
				String str3 = String.valueOf(frag3);
				String str4 = String.valueOf(frag4);
				set.add(str1+str3);
				set.add(str1+str4);
				set.add(str2+str3);
				set.add(str2+str4);
				set.add(str3+str1);
				set.add(str3+str2);
				set.add(str4+str1);
				set.add(str4+str2);
			}
			System.out.println(set.size());
			set.clear();
		}
	}
}