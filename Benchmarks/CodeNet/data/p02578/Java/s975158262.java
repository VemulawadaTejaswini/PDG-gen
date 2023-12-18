
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);

		int n= sc.nextInt();

		int cnt =0;

		int[] arr= new int[n];

		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		for(int j=0,k=1;j<n-1;j++,k++) {
			if(arr[j]<arr[k]) {
				cnt+=arr[k]-arr[j];
			}
		}
		System.out.println(cnt);
	}

}
