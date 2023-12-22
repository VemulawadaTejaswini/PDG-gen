import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];		

		for(int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}



		int SearchValue = 0;
		for(int i = 0 ; i < n ; i++) {

			if(SearchValue + 1 ==  a[i]) {
				SearchValue++;
			}

		}

		if(SearchValue == 0) {
			System.out.println(-1);
		}else {
			
			System.out.println(n-SearchValue);
		}
		
		
	}

}