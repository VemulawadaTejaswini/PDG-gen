import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []h = new int [n];
		int []t = new int [n];
		
		for(int i = 0; i < n ; i++) {
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < n-1 ; i++) {
			int l = h[i+1] - h[i];
			if(l > 0) {
				t[i] = 0;
				}
			else {
				t[i] = 1;
				}
			}
		t[n-1] = 0;
		
		int ans = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(t[i] == 0) {
				ans = Math.max(ans, sum);
				sum = 0;
				
			}
			if(t[i] == 1) {
				sum++;
			}
				
		}
		System.out.println(ans);
		
		}
	}



