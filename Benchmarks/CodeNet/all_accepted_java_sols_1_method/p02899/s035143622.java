import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		int ans[] = new int[n];

		for (int i = 0 ; i < n ; i++) {
			int	tmp = Integer.parseInt(sc.next());
			ans[tmp-1] = i + 1 ;
		}


		for(int i : ans) {
			System.out.println(i);
		}
	}

}