import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int[] num = new int[n];
		for (int a=0;a<x;a++){
			n=sc.nextInt();
			num[a]=n;
		}
		for (int b=x-1;b>0;b--){
			System.out.print(num[b]+" ");
		}
		System.out.println(num[0]);
	}
}