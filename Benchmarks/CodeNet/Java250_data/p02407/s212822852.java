import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int num[]= new int[n];
		for (int i=n-1;i>=0;--i){
			num[i]= sc.nextInt();
		}
		System.out.print(num[0]);
		for (int i=1;i<=n-1;++i){
			System.out.print(" "+num[i]);
		}
		System.out.println();
	}
}
