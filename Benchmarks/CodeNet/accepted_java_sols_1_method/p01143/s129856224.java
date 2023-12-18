import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if(n==0 && m==0 && p==0) break;
			
			int sum = 0;
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				sum += a[i];
			}
			sum = sum*(100-p);
			
			if(a[m-1]==0) System.out.println("0");
			else System.out.println(sum/a[m-1]);
		}
	}
}