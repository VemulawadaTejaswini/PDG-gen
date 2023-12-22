
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
		int cnt=1;
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>=max)
				cnt++;
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(cnt);
	}

}
