import java.io.*; 
import java.util.*;
class Main { 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=0;
		int x=0;
		int m=0;
		int count;
		for(int i=1;i<=n-1;i++){
			m = n-i;
            count=0;
			if(m!=1){
				for(int k=1;k*k<=m;k++){
					if(m%k==0){
						count++;
						if(k!=m/k){
							count++;
						}
					}
				}
				sum+=count;
			}
			else if(m==1){
				sum+=1;
			}
		}
		System.out.println(sum);
	} 
} 
