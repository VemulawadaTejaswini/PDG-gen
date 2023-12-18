import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		int i,j,k,n,c,count;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.next());
		int a[]=new int[n+1];
		for(i=0;i<n;i++){
			a[i]=Integer.parseInt(sc.next());
		}
		
		count=0;
	for(i=0;i<n;i++){
		
		for(j=n-1;j>0;j--){
			if(a[j]<a[j-1]){
			c=a[j];
			a[j]=a[j-1];
			a[j-1]=c;
			count++;
			}
		}
	}
		
		for(i=0;i<n;i++){
			System.out.print(a[i]);
			if(i==n-1){break;}
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println(count);
	}
}