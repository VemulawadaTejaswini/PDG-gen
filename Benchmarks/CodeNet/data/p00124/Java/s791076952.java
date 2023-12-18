import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        for(;;){
		int n=sc.nextInt();
		 System.out.println();
		if(n==0)break;
		String tn[] =new String[n];
		int tp[] =new int[n];
		for(int i=0; i<n; i++){
			tn[i]=sc.next();
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			tp[i]+=a*3+c;
		}
		for(int e = n-1; e>0; e--){ 
			
			for(int i=0; i<e; i++){
				if(tp[i+1] <=tp[i]){
					int tmp =tp[i];
					tp[i] =tp[i+1];
					tp[i+1] =tmp;
					String temp =tn[i];
					tn[i] =tn[i+1];
					tn[i+1] =temp;
				}
			}
		} 
		for(int i=n-1; i>=0; i--)System.out.println(tn[i]+","+tp[i]);
        }   
	}
	}
	