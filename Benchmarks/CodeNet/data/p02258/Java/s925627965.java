import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] r = new int[n];
		int ans;
		
		for(int i = 0; i < n; i++){
			r[i] = scan.nextInt();
		}
		
		int maxv = r[1]-r[0];
		int minv = r[0];
		
		for(int i = 1; i < n; i++){
			maxv = Math.max(maxv, r[i]-minv);
			minv = Math.min(minv, r[i]);
		}
		System.out.println(maxv);
	}
}