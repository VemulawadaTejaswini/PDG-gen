

import java.util.Scanner;

public class Main {

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[]ans = new int[n-1];
		for(int i=0;i<n-1;i++){
			ans[i]=0;
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				//shortest distance
				int d = Math.min(Math.abs(i-j),Math.min(Math.abs(x-1-i)+1+Math.abs(y-1-j),
						Math.abs(y-1-i)+1+Math.abs(x-1-j)));
				ans[d-1]+=1;
			}
			
		}
		for(int k:ans){
			System.out.println(k);
		}
	} 
}
