import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static int[] x=new int[n];
	private static int[] y=new int[n];
	public static void main (String[] args){
		for(int i=0;i<n;i++) x[i]=sc.nextInt();
		for(int i=0;i<n;i++) y[i]=sc.nextInt();
		System.out.printf("%.f\n%.f\n%.f\n%.f\n",cal(1),cal(2),cal(3),calf());
	}
	private static double cal(int k){
		double sum=0;
		for(int i=0;i<n;i++){
			sum=sum+Math.abs(Math.pow(x[i]-y[i],k));
		}
		return sum;
	}
	private static double calf(){
		double currentMax=Math.abs(x[0]-y[0]);
		for(int i=1;i<n;i++){
			currentMax=Math.max(Math.abs(x[i]-y[i]),Math.abs(x[i-1]-y[i-1]));
		}
		return currentMax;
	}
}