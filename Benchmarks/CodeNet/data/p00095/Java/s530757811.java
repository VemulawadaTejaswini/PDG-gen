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
		for(int i=1;i<n;i++){
			for(int j=i;j>=1;j--){
				if(v[j]>v[j-1]){
					int box=v[j];
					v[j]=v[j-1];
					v[j-1]=box;
					box=a[j];
					a[j]=a[j-1];
					a[j-1]=box;
				}
			}
		}
		System.out.println(a[0]+" "+v[0]);
	}
}