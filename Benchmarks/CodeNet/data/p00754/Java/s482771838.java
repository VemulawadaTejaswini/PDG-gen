import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String args[]){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			while(1>0){
				String line=reader.readLine();
				if(line.equals("."))break;
				int len=line.length();
				int flag=0;
				int[][] data;
				int[] rank_n;
				int rank=0;
				data=new int[120][120];
				rank_n=new int[120];
				for(int i=0;i<len;i++){
					if(rank<0 || flag==1)continue;
					String s=line.substring(i,i+1);
					if("(".equals(s)){
						rank_n[rank]++;
						data[rank][rank_n[rank]]=1;
						rank++;
					}
					if("[".equals(s)){
						rank_n[rank]++;
						data[rank][rank_n[rank]]=2;
						rank++;
					}
					if(")".equals(s)){
						rank--;
						if(rank<=-1)flag=1;
						else{
							if(data[rank][rank_n[rank]]==1)rank_n[rank]--;
							else flag=1;
						}
					}
					if("]".equals(s)){
						rank--;
						if(rank<=-1)flag=1;
						else{
							if(data[rank][rank_n[rank]]==2)rank_n[rank]--;
							else flag=1;
						}
					}
				}
				if(rank!=0)flag=1;
				System.out.printf("%s\n",flag==0?"yes":"no");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}