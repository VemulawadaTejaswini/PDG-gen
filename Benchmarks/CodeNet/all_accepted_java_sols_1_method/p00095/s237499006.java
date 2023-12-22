import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] v=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(a[j-1]>a[j]){
					int box=v[j-1];
					v[j-1]=v[j];
					v[j]=box;
					box=a[j];
					a[j]=a[j-1];
					a[j-1]=box;
				}
			}
		}
		int max=v[0];
		int maxPtr=a[0];
		for(int i=1;i<n;i++){
			if(v[i]>max){
				max=v[i];
				maxPtr=a[i];
			}
		}
		System.out.println(maxPtr+" "+max);
	}
}