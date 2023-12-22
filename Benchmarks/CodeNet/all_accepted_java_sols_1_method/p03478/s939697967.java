import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		int a = 0;
		int number = 0;

		for(int j=1; j<=N; j++) {
			//int number = 0;
			int l = String.valueOf(j).length();
			int jsum = 0;
			for(int k=0; k<l; k++) {
				jsum += Character.getNumericValue(String.valueOf(j).charAt(k));
			}
			if(A <=jsum && jsum <= B) {
				number += j;
			}
			ans = number;
		}
		a = ans;
		System.out.println(a);
	}

}
