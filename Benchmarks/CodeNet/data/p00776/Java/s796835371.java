import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;


public class Main {
	public static int[] s;
	public static int len;
	public static TreeSet<Integer> set;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			char[] tmp = in.next().toCharArray();
			if(tmp[0] == '#') break;
			s = new int[tmp.length];
			for(int i=0; i<tmp.length; i++){
				s[i] = tmp[i]-'a';
			}
			len = s.length;
			set = new TreeSet<Integer>();
			dfs(len-1, 0, 0, 0);
			out();
		}
	}
	
	public static void out(){
		System.out.println(set.size());
		if(set.size() > 10){
			Stack<Integer> stack = new Stack<Integer>();
			for(int i=0; i<5; i++){
				int idx = set.pollFirst();
				stack.push(set.pollLast());
				for(int j=0; j<len; j++){
					System.out.print(toc(s[j]+(get(idx, j, len)?1:0)));
				}
				System.out.println();
			}
			for(int i=0; i<5; i++){
				int idx = stack.pop();
				for(int j=0; j<len; j++){
					System.out.print(toc(s[j]+(get(idx, j, len)?1:0)));
				}
				System.out.println();
			}
		}else{
			for(int i:set){
				for(int j=0; j<len; j++){
					System.out.print(toc(s[j]+(get(i, j, len)?1:0)));
				}
				System.out.println();
			}
		}
	}
	
	public static char toc(int i){
		return (char)(i+'a');
	}
	
	public static void dfs(int idx, int alp, int change, int left){
		if(idx == -1){
			if(clear(left, 0, 26) == 0) set.add(change);
			return;
		}
		if(s[idx] != 25 && !get(alp, (s[idx]+1), 26)){
			dfs(idx-1, set(alp, s[idx]+1, 26), set(change, idx, len), clear(left, s[idx]+1, 26));
		}
		if(!get(alp, s[idx], 26)){
			dfs(idx-1, alp, change, set(left, s[idx], 26));
		}
	}
	
	public static int clear(int flag, int idx, int len){
		return flag & ~(1<<(len-idx-1));
	}
	
	public static int set(int flag, int idx, int len){
		return flag | 1<<(len-idx-1);
	}
	
	public static boolean get(int flag, int idx, int len){
		return (flag & 1<<(len-idx-1)) > 0;
	}
}