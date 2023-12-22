
import java.util.Arrays;
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
		Arrays.sort(arr);
		double den=Math.pow(2, n-1);
		double sum=0;
		for(int i=0,j=1;i<n;i++) {
			if(i<2) {
				sum+=arr[i];
			}else {
				sum+=arr[i]*Math.pow(2, j);
				j++;
			}
		}
		double s=sum/den;
		//System.out.println(sum+" "+den);
		System.out.println(s);
	}

}
