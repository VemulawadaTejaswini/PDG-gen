import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] p=new int[m];
		String[] s=new String[m];
		for(int i=0; i<m; i++){
			p[i]=sc.nextInt()-1;
			s[i]=sc.next();
		}
		int t=0;
		int f=0;
		boolean[] tf=new boolean[n];
		int[] countf=new int[n];
		for(int i=m-1; i>=0; i--){
			if(s[i].equals("AC")){
			if(!tf[p[i]]){
				tf[p[i]]=true;
				t++;
				}else{
					countf[p[i]]=0;
				}
			}else if(tf[p[i]] && s[i].equals("WA")){
				countf[p[i]]++;
			}
		}
		for(int i=0; i<n; i++){
			f+=countf[i];
		}
		System.out.println(t+" "+f);
	}	
}
