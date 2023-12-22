
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		long sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				sum+=arr[i]*arr[j];
			}
		}
		System.out.println(sum);
	}

}
