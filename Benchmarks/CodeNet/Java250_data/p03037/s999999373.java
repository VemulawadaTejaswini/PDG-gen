import java.util.*;

public class Main{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(); 
		int m=sc.nextInt();
		int l[]=new int[m];
		int r[]=new int[m];
		for(int i=0;i<m;i++){
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		int max=0;
		int min=1000000;
		
		for(int i=0;i<m;i++){
			if(max<l[i]){
				max=l[i];
			}
			if(min>r[i]){
				min=r[i];
			}
		}
		
		int count=0;
		
		
		for(int i=1;i<=n;i++){
			if(i>=max && i<=min){
				count++;
			}
		}
		
		System.out.println(count);
	}
}