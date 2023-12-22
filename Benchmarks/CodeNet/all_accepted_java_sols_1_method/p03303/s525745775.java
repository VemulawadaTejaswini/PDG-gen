import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = sc.nextInt();

		String a[] = new String[S.length()];

		for(int i=0;i<S.length();i++) {
			a[i] = S.substring(i, i+1);
		}

		int m = 0;
		String sum = "";

		while(m < S.length()) {
			sum = sum + a[m];
			m = m + n;
		}

		System.out.println(sum);


	}
}