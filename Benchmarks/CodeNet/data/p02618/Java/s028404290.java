import java.util.*;
import java.io.PrintWriter;

public class Main{
	static int[] c=new int[26];
	static int[] lastD=new int[26];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		Random rd=new Random();
		Random rc=new Random();
		int d=sc.nextInt();
		for(int i=0; i<26; i++){
			c[i]=sc.nextInt();
		}
		int[][] s=new int[d][26];
		for(int i=0; i<d; i++){
			for(int j=0; j<26; j++){
				s[i][j]=sc.nextInt();
			}
		}
		int maxSati=-1000000;
		int maxInd=-1;
		int[] ans=new int[d];
		TreeSet<Integer>[] memo=new TreeSet[26];
		for(int i=0; i<26; i++){
			memo[i]=new TreeSet<>();
			memo[i].add(0);
			memo[i].add(d+1);
		}
		//j:何日目
		long endSati=0;
		for(int j=0; j<d; j++){
			//i:どの大会をやるか
			for(int i=1; i<=26; i++){
				int sati=0;
				sati+=s[j][i-1];
				sati-=subSati(j+1,i-1);
				if(maxSati<sati){
					maxSati=sati;
					maxInd=i;
				}
			}
			ans[j]=maxInd;
			memo[maxInd-1].add(j+1);
			lastD[maxInd-1]=j+1;
			endSati+=maxSati;
			maxSati=-1000000;
			maxInd=-1;
		}
		long endTime=0;
		while(endTime-startTime<1800){
			int tmpd=rd.nextInt(d)+1;
			int tmpc=rc.nextInt(26)+1;
			long oldSati=endSati;
			endSati-=s[tmpd-1][ans[tmpd-1]-1];
			endSati+=s[tmpd-1][tmpc-1];
			endSati-=c[ans[tmpd-1]-1]*(tmpd-memo[ans[tmpd-1]-1].lower(tmpd))*(memo[ans[tmpd-1]-1].higher(tmpd)-tmpd);
			endSati+=c[tmpc-1]*(tmpd-memo[tmpc-1].lower(tmpd))*(memo[tmpc-1].higher(tmpd)-tmpd);
			if(oldSati<endSati){
				memo[ans[tmpd-1]-1].remove(tmpd);
				memo[tmpc-1].add(tmpd);
				ans[tmpd-1]=tmpc;
			}else{
				endSati=oldSati;
			}
			endTime = System.currentTimeMillis();
		}
		PrintWriter pw=new PrintWriter(System.out);
		for(int i:ans){
			pw.println(i);
		}
		pw.flush();
	}
	static int subSati(int d,int ii){
		int ret=0;
		for(int i=0; i<26; i++){
			if(i==ii) continue;
			ret+=c[i]*(d-lastD[i]);
		}
		return ret;
	}
}
