import java.util.*;
import java.io.*;
import java.awt.Point;

public class Main{
	static int h,w,n;
	static char[][] t;
	static String[] s;
	static ArrayList<Point> p;
	static boolean[] used;

	//ok
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmp = br.readLine().split(" ");
			h = Integer.parseInt(tmp[0]);
			w = Integer.parseInt(tmp[1]);
			if(h == 0 && w == 0) break;

			p = new ArrayList<Point>();
			t = new char[h][w];
			for(int i=0;i<h;i++){
				t[i] = br.readLine().toCharArray();
				for(int j=0;j<w;j++) if(t[i][j]=='.') p.add(new Point(j,i));
			}

			n = Integer.parseInt(br.readLine());
			s = br.readLine().split(" ");

			used = new boolean[n];
			System.out.println(solve(0)?"Yes":"No");
		}
	}

	//ok
	static boolean solve(int idx){
		if(idx == p.size()) return check();

		for(int i=0;i<n;i++) if(!used[i]) {
			used[i] = true;
			t[p.get(idx).y][p.get(idx).x] = s[i].charAt(0);
			if(solve(idx+1)) return true;
			used[i] = false;
		}

		return false;
	}

	//ok
	static boolean check(){
		//ツ縦ツチツェツッツク
		for(int j=0;j<w;j++){
			int i = 0;
			while(i<h){
				for(;i<h && t[i][j]=='#';i++);
				if(i>=h) break;
				String str = "" + t[i++][j];
				for(;i<h && t[i][j]!='#';i++) str += t[i][j];
				if(str.length()>=3 && !Eq(str)) return false;
			}
		}

		//ツ可。ツチツェツッツク
		for(int i=0;i<h;i++){
			int j = 0;
			while(j<w){
				for(;j<w && t[i][j]=='#';j++);
				if(j>=w) break;
				String str = "" + t[i][j++];
				for(;j<w && t[i][j]!='#';j++) str += t[i][j];
				if(str.length()>=3 && !Eq(str)) return false;
			}
		}

		return true;
	}

	//ok
	static boolean Eq(String str){
		String[] tmp = str.split("=");
		if(tmp.length<2 || tmp[0].equals("") || tmp[1].equals("")) return false;

		long left = Ex(tmp[0]);
		if(left==Long.MAX_VALUE) return false;
		long right = Ex(tmp[1]);
		if(right==Long.MAX_VALUE) return false;

		return left == right;
	}

	static long Ex(String str){
		String[] tmp = str.split("\\+|\\-|\\*|/");
		if(tmp.length == 0) return Long.MAX_VALUE;
		for(String ss : tmp){
			if(ss.equals("") || ss.length()>=2 && ss.charAt(0)=='0') return Long.MAX_VALUE;
		}

		ArrayList<Character> opCh = new ArrayList<Character>();
		int len = str.length();
		boolean before = false;
		if(str.charAt(0)<'0' || '9'<str.charAt(0)) return Long.MAX_VALUE;
		for(int i=1;i<len-1;i++){
			if(str.charAt(i)<'0' || '9'<str.charAt(i)){
				if(before) return Long.MAX_VALUE;
				before = true;
				opCh.add(str.charAt(i));
			}
			else{
				before = false;
			}
		}
		if(str.charAt(len-1)<'0' || '9'<str.charAt(len-1)) return Long.MAX_VALUE;
		if(opCh.size()+1 != tmp.length) return Long.MAX_VALUE;

		Stack<Long> val = new Stack<Long>();
		Stack<Character> op = new Stack<Character>();
		val.push(Long.parseLong(tmp[0]));
		int tmpIdx=1, opChIdx=0;

		while(tmpIdx<tmp.length){
			char ch = opCh.get(opChIdx++);

			if(!op.empty()){
				char ops = op.peek();
				if(ops=='*' || ops=='/' || (ops=='+' || ops=='-') && (ch=='+' || ch=='-')){
					op.pop();
					long b = val.pop();
					long a = val.pop();
					if(ops == '+') val.push(a+b);
					else if(ops == '-') val.push(a-b);
					else if(ops == '*') val.push(a*b);
					else if(ops == '/'){
						if(b==0 || a%b!=0) return Long.MAX_VALUE;
						val.push(a/b);
					}
				}
			}
			op.push(ch);
			val.push(Long.parseLong(tmp[tmpIdx++]));
		}

		while(!op.empty()){
			char ops = op.pop();
			long b = val.pop();
			long a = val.pop();
			if(ops == '+') val.push(a+b);
			else if(ops == '-') val.push(a-b);
			else if(ops == '*') val.push(a*b);
			else if(ops == '/'){
				if(b==0 || a%b!=0) return Long.MAX_VALUE;
				val.push(a/b);
			}
		}

		return val.peek();
	}
}