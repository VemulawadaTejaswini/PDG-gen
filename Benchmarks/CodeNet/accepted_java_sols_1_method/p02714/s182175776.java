import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int[][] cf=new int[n+2][26];
		for(int i=n; i>=1; i--){
			for(int j=0; j<26; j++){
				cf[i][j]=cf[i+1][j];
			}
			cf[i][s.charAt(i-1)-'A']++;
		}
		long ans=0;
		for(int i=1; i<n-1; i++){
			for(int j=0; j<i; j++){
				if(s.charAt(i)!=s.charAt(j)){
					if((s.charAt(i)=='R' && s.charAt(j)=='G') || (s.charAt(i)=='G' && s.charAt(j)=='R')){
						ans+=cf[i+2]['B'-'A'];
						if(2*i-j<n && s.charAt(2*i-j)=='B'){
							ans--;
						}
					}else if((s.charAt(i)=='B' && s.charAt(j)=='G') || (s.charAt(i)=='G' && s.charAt(j)=='B')){
						ans+=cf[i+2]['R'-'A'];
						if(2*i-j<n && s.charAt(2*i-j)=='R'){
							ans--;
						}
					}else{
						ans+=cf[i+2]['G'-'A'];
						if(2*i-j<n && s.charAt(2*i-j)=='G'){
							ans--;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
