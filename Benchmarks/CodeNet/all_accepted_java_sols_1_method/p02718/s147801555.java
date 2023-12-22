
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() , m = sc.nextInt();
		int [] arr = new int [n];int totalVotes = 0 ;
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();totalVotes += arr[i];
		}
		double popular = totalVotes / (4*m);
	//	System.out.println(totalVotes);
	//	System.out.println(popular);
		int ans = 0 ;
		for(int i = 0 ; i < n ; i++) {
			if(totalVotes <= arr[i] * 4 *m ) ans++;
		}
		if(ans >= m)
			System.out.println("Yes");
		else
			System.out.println("No");	
	}

}
