import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		int n=sc.nextInt();
		int a[];
		a=new int [n];

		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		int count=bubbleSort(a,n);

		for(int i=0;i<n-1;i++)
			System.out.print(a[i]+" ");
		System.out.println(a[n-1]);
		System.out.println(count);


	}

	private static int  bubbleSort(int a[],int n) {
		int flag = 1;
		int  i = 0,temp=0,count=0;
		while (flag==1) {
			flag = 0;
			for (int j=n-1;i+1<=j;j--) {
				if (a[j] < a[j-1]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					count++;
				}
				flag=1;
			}
			i++;
		}

		return count;
	}
	
}
