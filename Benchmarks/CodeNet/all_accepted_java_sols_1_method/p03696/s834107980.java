import java.util.Scanner;
import java.util.Stack;

/**
 * https://abc064.contest.atcoder.jp/tasks/abc064_d
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();
		
		Stack<String> stack = new Stack<>();
		for(int i=N-1; i>=0; i--){
			stack.push(Character.toString(s[i]));
		}
		
		StringBuilder sb = new StringBuilder();
		int current = 0;
		while(!stack.isEmpty()){
			String c = stack.pop();
			if(c.equals("(")){
				current++;
				sb.append(c);
			}else{
				if(current>0){
					sb.append(c);
					current--;
				}else{
					sb = new StringBuilder("("+ sb.toString()+")");
				}
			}
		}
		for(int i=0; i<current; i++){
			sb.append(")");
		}
		
		System.out.println(sb);

	}

}
