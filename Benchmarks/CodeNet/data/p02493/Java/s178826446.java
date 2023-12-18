import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a [] = new int [100];
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--){
			System.out.print(a[i]);
			if(i==0) {
				System.out.println("");
				break;
			}
			System.out.print(" ");
		}
	}

}