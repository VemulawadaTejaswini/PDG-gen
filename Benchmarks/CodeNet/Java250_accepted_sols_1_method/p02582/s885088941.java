import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);

		String s1=ob.next();
		char s[]=s1.toCharArray();
		Vector v=new Vector();
		for (int i=0; i<s1.length();) {
			if (s1.charAt(i)=='R') {
				int count=0;
				while (i<s1.length()&&s1.charAt(i)=='R') {
					i++;
					count++;
				}
				v.add(count);
			}
			else {
				while (i<s1.length()&&s1.charAt(i)=='S') {
					i++;
				}
			}
		}
		if (v.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(Collections.max(v));
		}
	}

}
