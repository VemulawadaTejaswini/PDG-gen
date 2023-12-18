import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		new AOJ1203();
	}
	
	class AOJ1203{
		AOJ1203(){
			while(sc.hasNextLine()){
				str=sc.nextLine();
				str = str.toUpperCase();
				str = str.replaceAll("[^A-Z]", "");
				solve();
			}
		}
		String str;
		char[] cs;
		void solve(){
			HashSet<String> ans=new HashSet<String>();
			cs=str.toCharArray();
			for(int c=0; c<str.length(); ++c){
				int l=c-1, r=c+1;
				if(0<=l && r<str.length() && cs[l]==cs[r]){
					String ret=f(l,r);
					if(ret.length()>2)	ans.add(ret);
				}
				l=c; r=c+1;
				if(0<=l && r<str.length() && cs[l]==cs[r]){
					String ret=f(l,r);
					if(ret.length()>2)	ans.add(ret);
				}			}
			int cnt=0;
			for(String s:ans){
				if(cnt>0)	System.out.print(" ");
				System.out.print(s);
				++cnt;
			}
			System.out.println();
		}
		String f(int l,int r){
			while(0<=l && r<str.length() && cs[l]==cs[r]){
				--l;	++r;
			}
			return str.substring(l+1, r);
		}
	}
}