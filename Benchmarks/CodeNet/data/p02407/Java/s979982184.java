import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int[] b =new int[n];
		for(int j=0;j<a.length;j++) {
			b[j]=a[n-1-j];
			System.out.printf("%d",b[j]);
			if(j!=a.length-1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		sc.close();
	}

}

