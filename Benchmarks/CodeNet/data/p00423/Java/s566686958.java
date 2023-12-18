import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x[] = new int[2];
		int sum[] = new int[2];
		
		for(int i=0; i<n; i++){
			x[0] = scan.nextInt();
			x[1] = scan.nextInt();
			if(x[0] > x[1])
				sum[0] += x[0]+x[1];
			else if(x[0] < x[1])
				sum[1] += x[0]+x[1];
			else{
				sum[0] += x[0];
				sum[1] += x[1];
			}
		}
		
		System.out.println(sum[0]+" "+sum[1]);
	}

}