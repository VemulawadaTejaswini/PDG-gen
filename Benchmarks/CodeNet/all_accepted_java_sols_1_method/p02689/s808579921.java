import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ans = 0;
		int n = scan.nextInt();
		int m = scan.nextInt();
		int h[] = new int[n];
		int a[][]= new int[m][2];
		int non[] = new int[n];
		
		for(int i=0;i<n;i++) {
			h[i] = scan.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<2;j++) {
				a[i][j] = scan.nextInt();
			}
			
			if(h[a[i][0]-1]<h[a[i][1]-1]) {
				non[a[i][0]-1] = 1;
			}else if(h[a[i][0]-1]>h[a[i][1]-1]){
				non[a[i][1]-1] = 1;
			}else if(h[a[i][0]-1]==h[a[i][1]-1]){
				non[a[i][1]-1] = 1;
				non[a[i][0]-1] = 1;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(non[i] == 0) {
				ans += 1;
			}
		}
		
		System.out.println(ans);
	}	
	
	
	//最小公約数
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
}
