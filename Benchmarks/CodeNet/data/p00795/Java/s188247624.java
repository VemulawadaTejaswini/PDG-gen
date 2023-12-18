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

	String s, key;

	void run(){
		for(;;){
			s="";
			for(;;){
				String line=sc.nextLine();
				if(line.equals("")){
					break;
				}
				s+=line;
			}
			key=sc.nextLine();
			solve();
			if(sc.hasNext()){
				sc.nextLine();
			}else{
				break;
			}
		}
	}

	void solve(){
		int i=0, j=0;
		int num=0;
		int n=s.length();

		int min=INF;
		int cmin=0;
		String first="";

		int nKey=0;
		boolean[] isKey=new boolean[256];
		for(char c : key.toCharArray()){
			isKey[c]=true;
		}
		for(boolean b : isKey){
			nKey+=b?1:0;
		}
		int[] count=new int[256];

		for(;;){
			// ½µÄ¢È¢ ¢¾j++
			for(; j<n&&num<nKey; j++){
				if(isKey[s.charAt(j)]&&count[s.charAt(j)]++==0){
					num++;
				}
			}

			if(num<nKey){
				break;
			}

			if(j-i<min){
				first=s.substring(i, j);
				min=j-i;
				cmin=1;
			}else if(j-i==min){
				cmin++;
			}

			if(isKey[s.charAt(i)]&&--count[s.charAt(i)]==0){
				num--;
			}
			i++;
		}

		println(cmin+"\n");
		if(cmin>0){
			// 72¶
			for(int k=0; k<(first.length()-1)/72+1; k++){
				println(first.substring(k*72, min((k+1)*72, first.length())));
			}
			println("");
		}
		// debug(cmin, first);
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