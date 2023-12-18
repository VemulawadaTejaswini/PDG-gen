

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++){
			String s = sc.next();
			solve(s);
		}
		
	}

	public void solve(String s) {
		System.out.println(rec(s));
	}

	private int rec(String s) {
		if(s.indexOf(']') == s.length()-1)
			return Integer.parseInt(s.substring(1, s.length()-1))/2+1;
		
		int last = 0;
		int cur = 0;
		
		ArrayList<Integer> l = new ArrayList<Integer>(); 
		for(int i=1;i<s.length()-1;i++){
			if(s.charAt(i)=='[')
				cur++;
			else if(s.charAt(i)==']')
				cur--;
			
			if(cur==0){
				l.add(rec(s.substring(last+1, i+1)));
				last = i;
			}
		}
		
		Collections.sort(l);
		int ret = 0;
		for(int i=0;i<l.size()/2+1;i++)
			ret += l.get(i);
//		System.out.println(s+" "+ret+" "+l.size());
		return ret;
	}

}