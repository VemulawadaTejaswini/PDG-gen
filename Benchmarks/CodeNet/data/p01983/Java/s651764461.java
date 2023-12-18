
import java.util.*;
public class Main {
	
	static List<Integer> query;

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			String str=in.next();
			if(str.charAt(0)=='.')break;
			
			String key=in.next();
			int sample=solve(str,key);
			
			int cnt=0;
			for(int i=0;i<=9;i++) {
				for(int j=0;j<=9;j++) {
					for(int k=0;k<=9;k++) {
						for(int l=0;l<=9;l++) {
							String subkey=String.valueOf(i)+String.valueOf(j)+String.valueOf(k)+String.valueOf(l);
							if(solve(str,subkey)==sample)cnt++;
						}
					}
				}
			}
			
			System.out.println(sample+" "+cnt);
		}
	}
	
	static int solve(String str,String key) {
		query=new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			query.add((int) str.charAt(i));
			char c=(char) query.get(i).intValue();
			if(c>='a' && c<='d')query.set(i, key.charAt(c-97)-48);
		}
		myHash(0);
		
		return query.get(0);
	}
	
	static void myHash(int p) {
		char ha=(char)query.get(p).intValue();
		
		if(ha!='[')return;
		
		char op=(char)query.get(p+1).intValue();
		
		if((char) query.get(p+2).intValue()=='[') {
			myHash(p+2);
			myHash(p+3);
			query.set(p, calc(op,query.get(p+2),query.get(p+3)));
		}
		else if((char) query.get(p+3).intValue()=='[') {
			myHash(p+3);
			query.set(p, calc(op,query.get(p+2),query.get(p+3)));
		}
		else {
			query.set(p, calc(op,query.get(p+2),query.get(p+3)));
		}
		cleanq(p);

	}
	
	static void cleanq(int p) {
		int i=0,l=query.indexOf(93);
		Iterator<Integer> itr=query.iterator();
		while(true) {
			int n=itr.next();
			if(i>=p+1)itr.remove();
			if(n==93)break;
			i++;
		}
	}
	
	static int calc(char op,int a,int b) {
		int res=0;
		
		switch(op) {
		case '+':
			res=a | b;
			break;
			
		case '*':
			res=a & b;
			break;
			
		case '^':
			res=a^b;
			break;
		}
		
		return res;
	}

}

