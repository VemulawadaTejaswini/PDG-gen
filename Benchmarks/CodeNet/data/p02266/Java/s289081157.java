import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> s3 = new Stack<>();
		int sum = 0;
		int a;
		
		String str = sc.nextLine();
		int l = str.length();
		char[] c = str.toCharArray();
		for(int i=0;i<l;i++) {
			char ch = c[i];
			if(ch == '\\'){
				s1.push(i);
			}else if(ch == '/' && s1.size() > 0){
				int j = s1.pop();
				sum += i-j;
				a = i-j;
				while(s2.size()>0 && s2.peek() > j) {
					a += s3.pop();
					s2.pop();
				}
				s2.push(j);
				s3.push(a);
			}
		}
		
		int b = s3.size();
		int[] ans = new int[b];
		for(int i=b-1;i>=0;i--) { 
			ans[i] = s3.pop();
		}
		System.out.println(sum);
		System.out.print(b);
		for(int i=0;i<b;i++) {
			System.out.print(" " + ans[i]);
		}
		System.out.println();
	 }
}


