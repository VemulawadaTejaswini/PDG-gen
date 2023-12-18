import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a =new int[n];
 		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
 		int[] b =new int[n];
 		for(int i=0;i<n;i++){
			b[i]=a[n-1-i];
 		}
		for(int j=0;j<n-1;j++){	
			System.out.print(b[j]+" ");
		}
		System.out.print(b[n-1]);
	}
}