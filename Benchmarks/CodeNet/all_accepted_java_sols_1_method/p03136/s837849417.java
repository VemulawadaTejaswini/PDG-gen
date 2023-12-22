import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] hens = new int[n];
		for(int i=0; i<n; i++){
			hens[i] = sc.nextInt();
		}
		
		int max = 0;
		int sum = 0;
		for(int i=0; i<n; i++){
			if(hens[i] > max){
				max = hens[i];
			}
			sum += hens[i];
		}
		
		if(max*2 >= sum){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}