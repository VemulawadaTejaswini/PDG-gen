import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int k=sc.nextInt();
		
		//最初はk通り。
		//次は隣とかぶらないようにk-1通り。
		
		long result=(int) (k*Math.pow((k-1),n-1));
		
		System.out.println(result);
		
		sc.close();


	}



}

