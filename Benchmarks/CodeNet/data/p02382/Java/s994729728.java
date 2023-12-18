import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static int[] x=new int[n];
	private static int[] y=new int[n];
	public static void main (String[] args){
		for(int i=0;i<n;i++) x[i]=sc.nextInt();
		for(int i=0;i<n;i++) y[i]=sc.nextInt();
		System.out.println(cal(1));
		System.out.println(cal(2));
		System.out.println(cal(3));
		System.out.println(calf());
	}
	private static double cal(int k){
		double sum=0;
		for(int i=0;i<n;i++){
			sum=sum+Math.abs(Math.pow(x[i]-y[i],k));
		}
		return Math.pow(sum,1.0/k);
	}
	private static double calf(){
		double currentMax=Math.abs(x[0]-y[0]);
		for(int i=1;i<n;i++){
			currentMax=Math.max(Math.abs(x[i]-y[i]),currentMax);
		}
		return currentMax;
	}
}