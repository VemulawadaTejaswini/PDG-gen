import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ2022(), "RUN", STACK_SIZE).start();
	}
	
	class AOJ2022 implements Runnable{
		AOJ2022(){}
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		
		int N,N2;
		
		void solve(){
			String[] str=new String[N];
			for(int i=0; i<N; ++i)	str[i]=sc.next();
			
			boolean[] eq=new boolean[N];
			for(int i=0; i<N; ++i){
				if(eq[i])	continue;
				for(int j=0; j<N; ++j){
					if(i!=j && !eq[j] && str[i].matches(".*?"+str[j]+".*?"))	eq[j]=true;
				}
			}
			ArrayList<String> str2=new ArrayList<String>();
			for(int i=0; i<N; ++i)if(!eq[i])	str2.add(str[i]);
			N2=str2.size();
			
//			System.out.println(str2);
			
			int[][] len=new int[N2][N2];
			for(int i=0; i<N2; ++i){
				for(int j=0; j<N2; ++j){
					if(i==j)	continue;
					int offset=0, l=str2.get(i).length();
					for( ; offset<l; ++offset){
						if( str2.get(j).startsWith( str2.get(i).substring(offset) ) )	break;
					}
					
					len[i][j]=l-offset;
				}
			}
			
//			for(int j=0; j<N2; ++j){
//				for(int i=0; i<N2; ++i)	System.out.print(len[i][j]+" | ");
//				System.out.println();
//			}
			
			StringBuilder[][] dp=new StringBuilder[1<<N2][N2];
			for(int i=0; i<N2; ++i){
				dp[1<<i][i]=new StringBuilder(str2.get(i));
			}
			for(int i=0; i<(1<<N2); ++i){
				for(int j=0; j<N2; ++j){
					if(dp[i][j]==null)	continue;
					for(int k=0; k<N2; ++k){
						if( (i&(1<<k)) > 0 )	continue;
						StringBuilder next=new StringBuilder(dp[i][j]);
						next.append(str2.get(k).substring(len[j][k]));
						int newIdx=i|(1<<k);
						int len1=dp[newIdx][k]==null? 1<<29 : dp[newIdx][k].length(), len2=next.length();
						if(len1>len2 || ( len1==len2 && dp[newIdx][k].toString().compareTo(next.toString()) > 0 ) ){
							dp[newIdx][k]=next;
						}
					}
				}
			}
			
//			for(int j=0; j<N2; ++j){
//				for(int i=0; i<(1<<N2); ++i)	System.out.print(dp[i][j]+" | ");
//				System.out.println();
//			}
			
			String ans=null;
			int tmp=(1<<N2)-1;
			for(int i=0; i<N2; ++i){
				if(dp[tmp][i]!=null && ( ans==null || ans.length() > dp[tmp][i].length() || ( ans.length()==dp[tmp][i].length() && ans.compareTo(dp[tmp][i].toString()) > 0 ) ) ){
					ans=dp[tmp][i].toString();
				}
			}
			System.out.println(ans);
			
		}
	}