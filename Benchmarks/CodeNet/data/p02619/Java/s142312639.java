import java.util.*;
import java.io.PrintWriter;

public class Main{
	static int[] c=new int[26];
	static int[] lastD=new int[26];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
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
		int sati=0;
		for(int i=1; i<=d; i++){
			int t=sc.nextInt()-1;
			lastD[t]=i;
			sati+=s[i-1][t];
			sati-=subSati(i);
			System.out.println(sati);
		}
	}
	static int subSati(int d){
		int ret=0;
		for(int i=0; i<26; i++){
			ret+=c[i]*(d-lastD[i]);
		}
		return ret;
	}
}
