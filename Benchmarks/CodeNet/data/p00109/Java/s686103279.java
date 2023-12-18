import java.util.Scanner;

public class Main{
	
	static int k(String e,char c1,char c2) {
		int nest = 0;
		for(int i=e.length()-1;i>=0;i--) {
			if(e.charAt(i) == ')') {
				nest++;
			}
			if(e.charAt(i) == '(') {
				nest--;
			}
			if((e.charAt(i) == c1 ||e.charAt(i) == c2) && nest==0) {
				return i;
			}
		}
		return -1;
	}
	
	static int calc(String e) {
		int pos = k(e,'+','-');
		if(pos!=-1) {
			if(e.charAt(pos)=='+') {
				return calc(e.substring(0,pos)) + calc(e.substring(pos+1));
			}else {
				return calc(e.substring(0,pos)) - calc(e.substring(pos+1));
			}
		}
		pos = k(e,'*','/');
		if(pos!=-1) {
			if(e.charAt(pos)=='*') {
				return calc(e.substring(0,pos)) * calc(e.substring(pos+1));
			}else {
				return calc(e.substring(0,pos)) / calc(e.substring(pos+1));
			}
		}
		if(e.startsWith("(")) {
			return calc(e.substring(1,e.length()-1));
		}
		return Integer.parseInt(e);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String e = sc.next();
			System.out.println(calc(e.substring(0,e.length()-1)));	
		}
	}
}
