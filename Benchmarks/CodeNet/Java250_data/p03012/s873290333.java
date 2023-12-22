import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] linea = s.nextLine().split(" ");
		int N=Integer.parseInt(linea[0]);
		int [] A=new int[N];
		String[] linea2 = s.nextLine().split(" ");
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(linea2[i]);
			
		}
		int d=999999999;
		int sum=0;
		for(int j=0;j<N;j++) {
			sum=sum+A[j];
		}
		int sum2=sum;
		int sum1=0;
		for(int k=0;k<N;k++) {
			sum1=sum1+A[k];
			sum2=sum2-A[k];
			if(Math.abs(sum1-sum2)<d) {
				d=Math.abs(sum1-sum2);
			}
		}
		System.out.print(d);

}}