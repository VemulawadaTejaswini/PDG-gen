import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int[][] g=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<s1.length()+1;i++){
			g[i][0]=i;
		}
		for(int j=1;j<s2.length()+1;j++){
			g[0][j]=j;
		}
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
				if(s1.substring(i-1,i).equals(s2.substring(j-1,j))){
					g[i][j]=g[i-1][j-1];
				}else{
					if(g[i-1][j]<=g[i][j-1] && g[i-1][j]<=g[i-1][j-1]){
						g[i][j]=g[i-1][j]+1;
					}else if(g[i][j-1]<=g[i-1][j] && g[i][j-1]<=g[i-1][j-1]){
						g[i][j]=g[i][j-1]+1;
					}else{
						g[i][j]=g[i-1][j-1]+1;
					}
				}
			}
		}
		System.out.println(g[s1.length()][s2.length()]);
	}
}
