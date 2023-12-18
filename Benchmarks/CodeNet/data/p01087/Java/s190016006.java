
import java.util.*;

public class Main {
	
	static List<P> data;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int n=in.nextInt();
			if(n==0)break;
			if(n==1) {
				int one=in.nextInt();
				System.out.println(one);
				continue;
			}
			
			data=new ArrayList<>();
			for(int i=0;i<n;i++) {
				P p=new P();
				String str=in.next();
				p.c=str.toCharArray();
				data.add(p);
			}
			System.out.println(calc(1,1,data.get(0).c[0]));
		}
	}
	
	static int calc(int level,int b,char op) {
		Stack<Integer> stk=new Stack<>();
		int res;
		
		for(int i=b;i<data.size();i++) {
			
			char c[]=data.get(i).c;
			if(c.length<=level)break;
			//System.out.println("Level="+level+" b="+i+" data="+c[level]);
			
			if(c[level]=='*' || c[level]=='+') {
				//System.out.println("Level="+level+":"+c[level]);
				stk.push(calc(level+1,i+1,c[level]));
			}
			else if(c[level]>='0' && c[level]<='9')stk.push(c[level]-48);
		}
		
		if(op=='*') {
			res=1;
			while(!stk.isEmpty()) res*=stk.pop();
		}
		else {
			res=0;
			while(!stk.isEmpty())res+=stk.pop();
		}
		
		return res;
	}

}

class P{
	char c[];
}



