import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		ArrayList<Integer> N = new ArrayList<Integer>();

		while(N.size() < n){
			int l = sc.nextInt();
			N.add(l);
		}		

		Collections.sort(N);
		Collections.reverse(N);

		while(k>0){
			ans = ans + N.get(k-1);
			k = k-1;
		}


		System.out.print(ans);
		
		sc.close();
	}
}