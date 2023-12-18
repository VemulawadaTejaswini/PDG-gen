
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int cnt=0;
		int n=scan.nextInt();
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++){
			arr1[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		for(int i=0;i<m;i++){
			int t=scan.nextInt();
			for(int j=0;j<n;j++){
				if(t==arr1[j])
				{
					cnt++;
					break;
				}
					
			}
		}
		
		System.out.println(cnt);
	}

}

