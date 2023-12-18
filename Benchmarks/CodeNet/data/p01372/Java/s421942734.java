import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static String s;
	public static int id;

	public static List<String> list;
	public static Set<Integer> set;

	public static int exp(){
		int ans = 0;
		if(s.charAt(id)=='('){
			id++;
			ans = kakko();
		}
		else ans = num();
		while(id < s.length()){
//			System.out.println("CH: " + s.charAt(id) + " STR:" + s);
			char ch = s.charAt(id);
			if(ch=='+'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					ans += kakko();
				}
				else ans += num();
			}
			else if(ch=='-'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					ans -= kakko();
				}
				else ans -= num();
			}
			else if(ch=='*'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					ans *= kakko();
				}
				else ans *= num();
			}
			else if(ch=='/'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					int a = kakko();
					if(a==0)return Integer.MAX_VALUE;
					ans /= a;
				}
				else {
					int a = num();
					if(a==0)return Integer.MAX_VALUE;
					ans /= a;
				}
			}
		}
		return ans;
	}

	public static int kakko(){
		int ans = 0;
		if(s.charAt(id)=='('){
			id++;
			ans = kakko();
		}
		else ans = num();
		while(s.charAt(id)!=')'){
//			System.out.println("CHCH: " + s.charAt(id));
			char ch = s.charAt(id);
			if(ch=='+'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					ans += kakko();
				}
				else ans += num();
			}
			else if(ch=='-'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					ans -= kakko();
				}
				else ans -= num();
			}
			else if(ch=='*'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					ans *= kakko();
				}
				else ans *= num();
			}
			else if(ch=='/'){
				id++;
				if(s.charAt(id)=='('){
					id++;
					int a = kakko();
					if(a==0)return Integer.MAX_VALUE;
					ans /= a;
				}
				else {
					int a = num();
					if(a==0)return Integer.MAX_VALUE;
					ans /= a;
				}
			}
		}
		id++;
		return ans;
	}

	public static int num(){
		int x = (int)(s.charAt(id)-'0');
		id++;
		while(id < s.length() && Character.isDigit(s.charAt(id))){
			x *= 10;
			x += (int)(s.charAt(id)-'0');
			id++;
		}
		return x;
	}

	public static void dfs(int k, String str){
		if(k==str.length()){
			list.add(str);
			return;
		}
		char ch = str.charAt(k);
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
			dfs(k+1, new String(str));
			int index = k;
			while(index < str.length() && str.charAt(index)!=')')index++;
			dfs(k+1, str.substring(0, k+1) + "(" + str.substring(k+1, index) + ")" + str.substring(index));
		}
		else dfs(k+1, new String(str));
	}

	public static void main(String[] args) {
		boolean debug = true;
		if(!debug){
			try {
				System.setOut(new PrintStream(new File("./src/mogi2011/D.txt")));
			} catch (FileNotFoundException e) {
				// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつス catch ツブツδ債ッツク
				e.printStackTrace();
			}
		}
		Scanner sc = new Scanner(System.in);
//		id = 0;
//		s = "(4+(8-7)))";
//		System.out.println(kakko());
		while(true){
			s = sc.next();
			if(s.equals("#"))break;
			list = new ArrayList<String>();
			dfs(0, new String(s));
			set = new HashSet<Integer>();
			id = 0;
			for(String st : list){
//				st = st+'$';
				s = st;
				id = 0;
				int ans = exp();
//				System.out.println("S:" + s + " " + ans);
				set.add(ans);
			}
//			for(int a:set)System.out.println(a);
			set.add(Integer.MAX_VALUE);
			System.out.println(set.size()-1);
		}
	}
}