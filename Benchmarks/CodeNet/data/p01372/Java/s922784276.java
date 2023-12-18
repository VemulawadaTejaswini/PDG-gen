import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//D: 6/2(1+2)
public class Main{

	public static String s;
	public static int index;
	
	public static char c(){
		return s.charAt(index++);
	}
	
	@SuppressWarnings("unchecked")
	public static Set<Integer> calc(List<Set<Integer>> list, List<Character> ope){
		int n = list.size();
		Set<Integer>[][] dp = new Set[n][n];
		for(int i=0;i<n;i++)dp[i][i]=list.get(i);
		for(int w=1;w<n;w++){
			for(int i=0;i+w<n;i++){
				Set<Integer> res = new HashSet<Integer>();
				for(int k=i;k<i+w;k++){
					for(int x : dp[i][k]){
						char ch = ope.get(k);
						for(int y : dp[k+1][i+w]){
							switch(ch){
							case '+': res.add(x+y);break;
							case '-': res.add(x-y);break;
							case '*': res.add(x*y);break;
							case '/': if(y==0)break;else res.add(x/y);break;
							}
						}
					}
				}
				dp[i][i+w] = res;
			}
		}
		return dp[0][n-1];
	}
	
	public static Set<Integer> exp(){
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		List<Character> ope = new ArrayList<Character>();
		while(true){
			char ch = c();
			if(Character.isDigit(ch)){
				index--;
				Set<Integer> a = new HashSet<Integer>();
				a.add(num());
				list.add(a);
			}
			else if(ch=='('){
				list.add(kakko());
			}
			else if(ch=='$')break;
			else {
				ope.add(ch);
			}
		}
		return calc(list, ope);
	}
	
	public static Set<Integer> kakko(){
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		List<Character> ope = new ArrayList<Character>();
		while(true){
			char ch = c();
			if(ch=='('){
				list.add(kakko());
			}
			else if(Character.isDigit(ch)){
				index--;
				Set<Integer> a = new HashSet<Integer>();
				a.add(num());
				list.add(a);
			}
			else if(ch==')'||ch=='$') break;
			else {
				ope.add(ch);
			}
		}
		return calc(list, ope);
	}
	
	public static int num(){
		char ch = c();
		int ans = ch-'0';
		while(Character.isDigit(ch)){
			ch = c();
			if(!Character.isDigit(ch))break;
			ans *= 10;
			ans += ch-'0';
		}
		index--;
		return ans;
	}
	
	public static void main(String[] args) {
		boolean debug = true;
		if(!debug){
			try {
				System.setOut(new PrintStream(new File("./src/icpc/D.txt")));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		Scanner sc = new Scanner(System.in);
		while(true){
			s = sc.next();
			if(s.equals("#"))break;
			s = s+"$";
			index = 0;
			System.out.println(exp().size());
		}
	}
}