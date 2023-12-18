import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a;
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int cnt=0;
		int flag=1;
		int tmp,j;
		while(flag==1){
			flag=0;
			for(j=n-1;j>0;j--){
				if(a[j]<a[j-1]){
					tmp=a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
					cnt++;
					flag=1;
				}
			}
		}
		for(int i=0;i<n-1;i++){
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n-1]);
		System.out.printf("\n");
		System.out.println(cnt);
		sc.close();
	}
}
