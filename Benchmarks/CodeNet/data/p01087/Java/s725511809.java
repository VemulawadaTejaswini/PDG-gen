import java.util.Scanner;

public class Main {
	static int l;
	
	static int count(String str) {
		int cnt = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='.')
				cnt++;
		}
		return cnt;
	}
	
	static int f(int[] a,char d,int k) {		//数字と演算子を送って計算
		
		int sum = 0;
		int n = 0;
		boolean isMul = false;
		if(d=='*') {
			sum = 1;
			isMul = true;
		}
		for(int aa:a) {
			if(isMul) sum *= aa;
			else sum += aa;
			n++;
			if(n==k)break;
		}

		return sum;
	}
	
	static int parse(int max,String[] str,int min) {
		
		char d = ' ';
		int k = 0;
		int[] put = new int[9];
		boolean change = false;
		String rs = "";
		
		if(max==min+1) {
			d = str[0].charAt(min-1);
			for(String s:str) {
				if(s.length()>=max) {	
					int cnt = count(s);			//数字だけ抜き出すため
					put[k] = Integer.parseInt(s.substring(cnt));
					k++;
				}
			}
			return f(put,d,k);
		}
		
		for(String s:str) {
			if(change && s.length()<=max-1) {
				String S ="";
				for(int i=0;i<max-2;i++) {
					if(i==0) 
						S = ".";
					else
						S += ".";
				}
						
				S += String.valueOf(f(put,d,k));
				k = 0;
				if(rs=="")
					rs = S;
				else
					rs = rs +":"+S;
				change = false;
			}
			if(s.length() >= max-1 && !Character.isDigit(s.charAt(max-2))) {
				change = true;
				if(s.length()==max-1 && !Character.isDigit(s.charAt(max-2))) {
					d = s.charAt(max-2);
				}
				if(s.length()>=max) {
					int cnt = count(s);
					put[k] = Integer.parseInt(s.substring(cnt));	
					k++;
				}
			}
			else {	
				if(rs=="")
					rs = s;
				else
					rs = rs+":"+s;
			}
		}
		if(change) {
			String S ="";
			for(int i=0;i<max-2;i++) {
				if(i==0) S = ".";
				else
					S += ".";
			}
				
			S += String.valueOf(f(put,d,k));
			if(rs=="")
				rs = S;
			else
				rs = rs +":"+S;
		}
		str = rs.split(":");
		return parse(max-1,str,min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			int l = 0;
			int ll = 999999999;
			String[] str = new String[n];
			for(int i=0;i<n;i++) {
				str[i] = sc.next();
				l = Math.max(l, str[i].length());	//最大の長さ
				ll = Math.min(ll, str[i].length());
			}
			if(n>1)
				System.out.println(parse(l,str,ll));
			else
				System.out.println(str[0]);
		}
	}
}
