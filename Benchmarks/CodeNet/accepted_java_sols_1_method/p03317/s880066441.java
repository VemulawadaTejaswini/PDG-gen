import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] a=new int[n+1];
			for(int i=0; i<n; i++) {
				a[i]=sc.nextInt();
			}
			n--;
			k--;
			if(n%k>0) {
				System.out.println(n/k+1);
			}
			else {
				System.out.println(n/k);
			}
			
		}
	}
}

