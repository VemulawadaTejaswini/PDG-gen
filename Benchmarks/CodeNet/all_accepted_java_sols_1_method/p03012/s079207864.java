import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
		
		int n=sc.nextInt();
		int sum=0;
		int[] w=new int[n];		
		for(int i=0;i<n;i++){
			w[i]=sc.nextInt();
			sum=sum+w[i];
		}
		 int l=sum;
		 int f =0;
		 int dif=sum;
		 
		for(int i=0;i<n;i++){
			l=l-w[i];
			f=f+w[i];
			if(Math.abs(l-f)>dif)break;
			dif=Math.abs(l-f);
		}
		
		
		System.out.println(dif);
	}

}