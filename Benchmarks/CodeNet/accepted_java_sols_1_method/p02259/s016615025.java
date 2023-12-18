import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n,a[]=new int[100],i,j,t,s=0;
		n=stdIn.nextInt();
		for(i=0;i<n;i++)a[i]=stdIn.nextInt();
		for(i=0;i<n-1;i++){
			for(j=n-1;j>i;j--){
				if(a[j-1]>a[j]){
					t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
					s++;
				}
			}
		}
		System.out.print(a[0]);
		for(i=1;i<n;i++)System.out.print(" "+a[i]);
		System.out.println("\n"+s);
	}
}
