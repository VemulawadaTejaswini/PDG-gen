import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		int sum = 0;
		
		for(int ir = 0; ir < r; ir++) {
			for(int ic = 0; ic < c; ic++) {
				a[ir][ic] = sc.nextInt();
			}
		}
		
		for(int ir = 0; ir < r; ir++) {
			int rsum =0;
			for(int ic = 0; ic < c; ic++) {
				System.out.print(a[ir][ic] + " ");
				rsum += a[ir][ic];
				sum += a[ir][ic];
			}
			System.out.println(rsum);
		}
		
		for(int ic = 0; ic < c; ic++) {
			int csum = 0;
			for(int ir = 0; ir < r; ir++) {
				csum += a[ir][ic];
			}
			System.out.print(csum + " ");
		}
		System.out.println(sum);
	}
}

