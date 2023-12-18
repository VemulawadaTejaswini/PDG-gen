import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	String s;

	void run(){
		for(; sc.hasNextLine();){
			s=sc.nextLine();
			solve();
		}
	}

	void solve(){
		s=s.toUpperCase().replaceAll("[^A-Z]", "");
		int n=s.length();
		TreeSet<String> set=new TreeSet<String>();
		for(int j=0; j<n; j++){
			int i;
			for(i=0; j-i>=0&&j+i<n&&s.charAt(j-i)==s.charAt(j+i); i++);
			i--;
			if(i>=1){
				set.add(s.substring(j-i, j+i+1));
			}
			for(i=0; j-i>=0&&j+i+1<n&&s.charAt(j-i)==s.charAt(j+i+1); i++);
			i--;
			if(i>=1){
				set.add(s.substring(j-i, j+i+2));
			}
		}
		// debug(set.toArray());
		// ABCBABCBBB
		// BBBBBBBBBBBBBBBBBBBBB
		// ABABABABABA
		for(Iterator<String> i=set.iterator(); i.hasNext();){
			// iツづーツ湘つキツつゥツづつ、ツつゥ
			String s=i.next();
			for(Iterator<String> j=set.iterator(); j.hasNext();){
				String t=j.next();
				if((s.length()+t.length())%2==0&&t.length()>s.length()){
					int k=(t.length()-s.length())/2;
					if(t.substring(k, t.length()-k).equals(s)){
						i.remove();
						break;
					}
				}
			}
		}
		// debug(set.toArray());
		for(; !set.isEmpty();){
			print(set.pollFirst());
			if(!set.isEmpty()){
				print(" ");
			}
		}
		println("");
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}