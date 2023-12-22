import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int minCost = 1001;
		boolean flag = false;

		for(int i=0;i<n;i++){
			int c = sc.nextInt();
			int tx = sc.nextInt();
			if(t>=tx){
				flag = true;
				minCost = Math.min(c,minCost);
			}
		}
			
		if(!flag){

			System.out.println("TLE");
		}else{
			
		System.out.println(minCost);
		}
	}
}