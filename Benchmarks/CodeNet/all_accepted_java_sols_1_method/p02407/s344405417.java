import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int[] a = new int[n];
		for(int i = n;i>0;i--){
			a[i-1]=scan.nextInt();
		}
		for(int i= 0; i<n-1;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n-1]);
	}
}
