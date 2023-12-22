import java.util.Scanner;
//import java.Math;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n,T,A,i,ansb=0,gosa=987654321;
		n=scan.nextInt();
		T=scan.nextInt();
		A=scan.nextInt();
		for(i=0;i<n;i++){
			int H=scan.nextInt();
			if(gosa>Math.abs(T*1000-H*6-A*1000)){
				gosa=Math.abs(T*1000-H*6-A*1000);
				ansb=i+1;
			}
		}
		System.out.println(ansb);
	}
}