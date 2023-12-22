import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] a=new int[n];
		boolean jubge=false;
		double sum=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(a[i]<a[j]){
					int nn=a[j];
					a[j]=a[i];
					a[i]=nn;
				}
			}
		}
		
		sum=(double)(sum)/(4*m);
		int count=0;
		for(int i=0;i<n;i++){
			if(a[i]>=sum){
				count++;
			}
		}
		
		if(count>=m)System.out.println("Yes");
		else System.out.println("No");
	}
}