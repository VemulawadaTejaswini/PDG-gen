
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
		String s=ob.next();
		int a[]=new int[s.length()];
		int k=0;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)=='R') {
				a[k]++;
			}
			else {
				k++;
			}
		}
	                   Vector  v=new Vector ();
		for(int i=0;i<a.length;i++){v.add(a[i]);}
		System.out.println(Collections.max(v));
	}
}
