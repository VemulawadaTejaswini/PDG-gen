import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int r=sc.nextInt();
		int s=sc.nextInt();
		int p=sc.nextInt();
		String t=sc.next();
		long ans=0;
		char[] tt=new char[n];
		for(int i=0; i<n;i++){
			tt[i]=t.charAt(i);
			if(tt[i]=='r'){
				if(i-k>=0){
					if(tt[i-k]!='p'){
						tt[i]='p';
						ans+=p;
					}else{
						tt[i]='7';
					}
				}else{
					tt[i]='p';
					ans+=p;
				}
			}else if(tt[i]=='s'){
				if(i-k>=0){
					if(tt[i-k]!='r'){
						tt[i]='r';
						ans+=r;
					}else{
						tt[i]='7';
					}
				}else{
					tt[i]='r';
					ans+=r;
				}
			}else{
				if(i-k>=0){
					if(tt[i-k]!='s'){
						tt[i]='s';
						ans+=s;
					}else{
						tt[i]='7';
					}
				}else{
					tt[i]='s';
					ans+=s;
				}
			}
		}
		System.out.println(ans);
	}
}
