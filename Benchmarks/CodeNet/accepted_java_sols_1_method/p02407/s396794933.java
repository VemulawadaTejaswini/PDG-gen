import java.util.Scanner;

public class Main{	
	public static void main(String[] arts){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a;
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(i!=n-1)
				System.out.printf("%d ",a[n-i-1]);
			else
				System.out.println(a[n-i-1]);
		}
		sc.close();
	}
}
