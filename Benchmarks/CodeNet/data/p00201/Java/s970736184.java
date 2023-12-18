import java.util.*;
class Main{
	static HashMap<String,Integer> dat;
	static HashMap<String,Integer> memo;
	static String table[][];
	static String k[];
	static int solve(String a){
	//	if(memo.containsKey(a))return memo.get(a);
		int ret=dat.get(a);
		for(int i=0;i<k.length;i++)
			if(k[i].equals(a)){
				int val=0;
				for(int j=0;j<table[i].length;j++){
					val+=solve(table[i][j]);
				}
				ret=Math.min(ret,val);
			}
		memo.put(a,ret);
		return ret;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a;
		while(true){
			a=s.nextInt();
			if(a==0)System.exit(0);
			dat=new HashMap<String,Integer>();
			memo=new HashMap<String,Integer>();
			for(int i=0;i<a;i++){
				String str=s.next();
				int p=s.nextInt();
				dat.put(str,p);
			}
			int b=s.nextInt();
			k=new String[b];
			table=new String[b][];
			for(int i=0;i<b;i++){
				k[i]=s.next();
				int c=s.nextInt();
				table[i]=new String[c];
				for(int j=0;j<c;j++)table[i][j]=s.next();
			}
			String m=s.next();
			System.out.println(solve(m));
		}
	}
}