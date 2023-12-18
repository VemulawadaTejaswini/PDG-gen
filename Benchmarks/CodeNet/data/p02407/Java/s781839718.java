import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a[]=new int[100];
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		
			
		for(i=0;i<n/2;i++){
			int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		
		for(i=0;i<n-1;i++)System.out.printf("%d ",a[i]);
		System.out.printf("%d\n",a[n-1]);
	}
}
