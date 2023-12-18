import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		b[0]=0;
		
		for(int i = 0; i<n; i++){
			a[i] = sc.nextInt();
		}
		b[1]=Math.abs(a[0]-a[1]);
		for(int i = 2; i<n; i++){
			b[i]=Math.min((Math.abs(a[i-2]-a[i])+b[i-2]),(Math.abs(a[i-1]-a[i])+b[i-1]));
			
		}
		System.out.println(b[n-1]);
	}
}