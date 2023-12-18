import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1155();
	}
	
	class AOJ1155{
		AOJ1155(){
			while(true){
				String str=sc.next();
				if(str.equals("."))	break;
				solve(str);
			}
		}
		void solve(String str){
			int cnt=0;
			str+="#";
			for(int p=0; p<=2; ++p)for(int q=0; q<=2; ++q)for(int r=0; r<=2; ++r){
				String tmp=str.replaceAll("P", ""+p).replaceAll("Q", ""+q).replaceAll("R", ""+r);
//				System.out.println(tmp);
				this.line=tmp.toCharArray();
				this.pos=0;
				int ret=expr();
//				System.out.println(ret);
				cnt += (ret==2?1:0);
			}
			System.out.println(cnt);
		}
		final int[][]	and={{0,0,0},{0,1,1},{0,1,2}},
				or={{0,1,2},{1,1,2},{2,2,2}};
		final int[] m={2,1,0};
		char[] line;
		int pos=0;
		private int expr(){
			int ret=term();
			while(true){
				char op=line[pos];
				if( op=='+' ){
					int old=ret;
					++pos;
					ret=term();
					ret=or[old][ret];
//					System.out.println(old+"+"+ret+" = "+or[old][ret]);
				}else	break;
			}
			return ret;
		}
		private int term(){
			int ret=fact();
			while(true){
				char op=line[pos];
				if( op=='*' ){
					int old=ret;
					++pos;
					ret=fact();
					ret=and[old][ret];
//					System.out.println(old+"*"+ret+" = "+and[old][ret]);
				}else	break;
			}
			return ret;
		}
		private int fact(){
			if(line[pos]=='-'){
				++pos;
				return m[fact()];
			}else if(Character.isDigit(line[pos])){
				int ret=line[pos]-'0';
				++pos;
				return ret;
			}else if(line[pos]=='('){
				++pos;
				int ret=expr();
				++pos;
				return ret;
			}
			return 0;
		}
	}
	
	class AOJ1153{
		AOJ1153(){
			while(true){
				int n=sc.nextInt(),m=sc.nextInt();
				if((n|m)==0)	break;
				solve(n,m);
			}
		}
		void solve(int n,int m){
			int[] nn=new int[n],
					mm=new int[m];
			int ns=0, ms=0;
			for(int i=0; i<n; ++i){
				nn[i]=sc.nextInt();
				ns+=nn[i];
			}
			for(int i=0; i<m; ++i){
				mm[i]=sc.nextInt();
				ms+=mm[i];
			}
			Arrays.sort(nn);
			Arrays.sort(mm);
			int cand1=-1,cand2=-1,sum=Integer.MAX_VALUE/4;
			for(int i=0; i<n; ++i){
				for(int j=0; j<m; ++j){
					if(ns-nn[i]+mm[j] == ms-mm[j]+nn[i] && sum>nn[i]+mm[j]){
						cand1=i;
						cand2=j;
						sum=nn[i]+mm[j];
					}
				}
			}
			System.out.println(cand1<0? "-1" : nn[cand1]+" "+mm[cand2]);
		}
	}
}