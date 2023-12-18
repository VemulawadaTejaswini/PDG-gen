import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		long ans=0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>=a[i+1]){ans=ans+(a[i]-a[i+1]);a[i+1]=a[i];}
		}
		System.out.println(""+ans);
	}
}