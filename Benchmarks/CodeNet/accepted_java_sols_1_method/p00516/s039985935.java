import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int n1[]=new int[n];
		int m1[]=new int[m];
		int vote[]=new int[n];
		for(int i = 0;i<n;i++)
			n1[i]=sc.nextInt();	
		for(int i=0;i<m;i++)
			m1[i]=sc.nextInt();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(m1[i]>=n1[j]){					
					vote[j]++;break;	
				}
			}
		}
		int no1=0,ans=0;
		for(int i=0;i<n;i++){
			if(vote[i]>no1){
				no1=vote[i];
				ans=i+1;
			}
		}
		System.out.println(ans);
	}
}