
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
		for(int i=0;i<n;i++) {
			arr[i]-=scn.nextInt();
		}
		int tot=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				tot+=arr[i];
			}
		}
		System.out.println(tot);
	}

}
