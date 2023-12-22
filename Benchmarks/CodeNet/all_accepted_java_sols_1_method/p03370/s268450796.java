import java.util.Scanner;
public class Main{
 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int m[] = new int[n];
		int total = n;
		int remain = x;
		for(int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			remain-=m[i];
		}
		int greatest = 0;
		if(remain > 0) {
			for(int i = 0; i < n; i++) {
				if((remain-remain%m[i])/m[i] > greatest) {
					greatest = (remain-remain%m[i])/m[i];
				}
			}
		}
		total+=greatest;
		
		System.out.println(total);
	}
}