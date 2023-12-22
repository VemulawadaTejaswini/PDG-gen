
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
		int flag=0;
		for(int i=n-2;i>=0;) {
			if(arr[i+1]>=arr[i]) {
				i--;
			}else {
				if(arr[i]-1!=arr[i+1]) {
					flag=1;
					break;
				}else {
					arr[i]--;
					i--;
				}
			}
		}
		if(flag==1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
