import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=x-k+1; i<x+k; i++){
			if(i != x-k+1){
				System.out.print(" ");
			}
			System.out.print(i);
		}
	}
}
