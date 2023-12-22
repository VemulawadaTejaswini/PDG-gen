import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int[] h = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		
		int res = 1;
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(h[i] < h[j]){
					break;
				}
				
				if(j == i-1) {
					res++;
				}
			}
		}
		
		System.out.println(res);
	}
}
