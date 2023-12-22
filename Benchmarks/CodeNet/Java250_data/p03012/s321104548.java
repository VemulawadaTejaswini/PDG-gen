import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] w=new int[n];
		for(int i=0;i<n;i++){
			w[i]=sc.nextInt();
		}
		int[] z=new int[n];
		for(int t=0;t<n-1;t++){
			int s1=0;
			int s2=0;
			for(int i=0;i<=t;i++){
				s1+=w[i];
			}
			for(int j=t+1;j<n;j++){
				s2+=w[j];
			}
			z[t]=s1-s2;
			if(z[t]<0)
			z[t]=-z[t];
		}
		int min=z[0];
		for(int i=0;i<n-1;i++){
			if(min>z[i])
				min=z[i];
		}
		System.out.println(min);
	}
		
}