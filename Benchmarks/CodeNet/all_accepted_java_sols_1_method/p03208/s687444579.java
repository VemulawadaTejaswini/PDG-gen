import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int h[] = new int[n];
		int min = 1000000000;
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		for(int i = 0; i < n - k + 1; i++){
			int num = Math.abs(h[i+k-1]-h[i]);
			if(min > num){
				min = num;
			}
		}
		System.out.print(min);
	}
}
