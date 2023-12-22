import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] hm = new int [100];
		for(int i =0; i < n; i++){
			hm[i] = sc.nextInt();
		}
		for(int i = n-1; i >= 0; i--){
			System.out.print(hm[i]);
			if(i!=0){
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}