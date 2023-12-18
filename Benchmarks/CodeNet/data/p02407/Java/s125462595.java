import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int i=0;
		for(;i<n;i++) a[i]=scan.nextInt();
		for(i--;0<i;i--){
			System.out.print(a[i]+" ");
		}
		System.out.println(a[0]);
		scan.close();
	}
}