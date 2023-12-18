import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] h = new int[100000001];
		boolean flag=false;
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
			if( i!=0 && h[i]>h[i-1] ) {
					h[i]--;
			}
		}
		for(int i=0;i<n;i++) {
			if(i!=0 && h[i]<h[i-1]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
