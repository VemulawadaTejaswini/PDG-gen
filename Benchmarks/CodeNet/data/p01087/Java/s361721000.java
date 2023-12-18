import java.util.Scanner;

public class Main {
	static Scanner in;
	static String[] line;
	static int n;
	
	public static void main(String[] args){
		in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n==0) break;
			
			line = new String[n];
			for(int i=0;i<n;i++){
				line[i] = in.next();
			}
			now = 0;
			System.out.println(calc('+',0));
			System.gc();
		}
	}
	static int now;
	public static int calc(char op,int level){
		int ans = (op=='+')?0:1;
		while(true){
			if(now>=n) return ans;
			String next = line[now];
			if(level>0 && (level-1>=next.length() || next.charAt(level-1)!='.')){
				return ans;
			}
			if(next.charAt(level)=='+'){
				if(op=='+'){
					now++;
					ans += calc('+',level+1);
				}else{
					now++;
					ans *= calc('+',level+1);
				}
			}else if(next.charAt(level)=='*'){
				if(op=='+'){
					now++;
					ans += calc('*',level+1);
				}else{
					now++;
					ans *= calc('*',level+1);
				}
			}else{
				if(op=='+'){
					now++;
					ans += next.charAt(level)-'0';
				}else{
					now++;
					ans *= next.charAt(level)-'0';
				}
			}
		}
	}
}