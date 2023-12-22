import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int ans=bubbleSort(a,n);
		write(a,n);
		System.out.println(ans);
	}
	static void write(int[] a,int n){
		for(int i=0;i<n-1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println(a[n-1]);
	}
	static int bubbleSort(int[] a, int n){
		boolean flag=true;
		int i=0;
		int count=0;
		while(flag){
			flag=false;
			for(int j=n-1;j>i;j--){
				if(a[j]<a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					flag=true;
					count++;
				}
			}
			i++;
		}
		return count;
	}

}