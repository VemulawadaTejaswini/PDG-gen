
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
		int ans=arr[0];
		for(int i=1;i<n;i++) {
			int x=arr[i]%ans;
			while(x!=0) {
				int temp=x;
				x=ans%x;
				ans=temp;
			}
		}
		System.out.println(ans);
	}

}
