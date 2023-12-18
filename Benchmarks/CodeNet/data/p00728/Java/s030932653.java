import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			int sum = 0;
			
			for(int i=0;i<a.length;i++){
				a[i] = stdIn.nextInt();
				sum+=a[i];
			}
			
			int max = a[0];
			int min = a[0];
			
			for(int i=1;i<a.length;i++){
				max = Math.max(max, a[i]);
				min = Math.min(min, a[i]);
			}

			sum-=(max+min);
			System.out.println(sum/(n-2));
		}

	}
}