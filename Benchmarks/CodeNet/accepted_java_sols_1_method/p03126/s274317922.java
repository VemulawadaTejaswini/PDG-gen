

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
	
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] a=new int[m];
		
		for(int i=0;i<n;i++){
			int k=sc.nextInt();
		    int[] A=new int[k];
			for(int j=0;j<k;j++)a[sc.nextInt()-1]++;
		}
		sc.close();
		
		int ans=0;
		
		for(int i=0;i<m;i++){
			if(a[i]==n)ans++;
		}
		
		System.out.println(ans);
		
	}

}
