import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int n,i,j;
		int a[]= new int[1000];
		Scanner br = new Scanner(System.in);
		n=br.nextInt();
		for(i=0;i<n;i++){
			a[i]=br.nextInt();
		}
		for(j=n-1;j>=0;j--){
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
}