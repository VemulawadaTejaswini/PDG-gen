import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		//入力
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}

		//出力
		for(int i=a.length-1; i>0; i--) {
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d%n",a[0]);
	}

}

