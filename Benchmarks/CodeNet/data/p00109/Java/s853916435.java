import java.util.Scanner;

public class Main {
	static int lastInd(String str,char a) {
		int n = 0;
		for(int i=str.length()-1;i>0;i--) {		//()内は無視
			char c = str.charAt(i);
			if(c=='(')
				n++;
			if(c==')')
				n--;
			if(a==c && n==0)
				return i;
		}
		return -1;
	}
	

	
	static int parse(String str) {
		int a = str.length();
		int n = 0;
		int g = 0;
		if(str.startsWith("(") && str.endsWith(")")) {				//(で始まり)で終わる
			if(!str.substring(1, a-1).contains("("))				//間に()がなければsubstr
				return parse(str.substring(1, str.length()-1));
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)=='(') {
					n++;
					g++;
				}
				if(str.charAt(i)==')') n--;
				if(g!=0 && n==0) {
					break;
				}
				if(i==str.length()-2 && n-1==0) {
					return parse(str.substring(1, str.length()-1));
				}
			}
		}
		
		int ind = lastInd(str,'+');
		if(ind!=-1) {
			return parse(str.substring(0, ind)) + parse(str.substring(ind+1));
		}
		
		ind = lastInd(str,'-');
		if(ind!=-1) {
			return parse(str.substring(0, ind)) - parse(str.substring(ind+1));
		}
		
		ind = lastInd(str,'/');
		if(ind!=-1) {
			return parse(str.substring(0, ind)) / parse(str.substring(ind+1));
		}
		
		ind = lastInd(str,'*');
		if(ind!=-1){
			return parse(str.substring(0, ind)) * parse(str.substring(ind+1));
		}
		
		
		
		else
			return Integer.parseInt(str);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a--!=0) {
			String str = sc.next();
			System.out.println(parse(str.substring(0,str.length()-1)));
		}
	}
}
