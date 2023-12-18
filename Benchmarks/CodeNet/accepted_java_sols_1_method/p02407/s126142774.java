import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<=n-1;i++){
			a[i]=sc.nextInt();
		}
		for(i=n-1;i>=0;i--){
			System.out.print(a[i]);
			if(i!=0){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}