import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();

		char[] chAry = new char[n];

		for (int i=0; i<n; i++){

			chAry[i] = s.charAt(i);

		}

		char[] chAryCopy = chAry.clone();

		Arrays.sort(chAryCopy);

		int cnt = 0;
		for (int i=0; i<n; i++){

			if (chAry[i] != chAryCopy[i]){
				cnt ++;
			}
		}
		System.out.println(cnt / 2);

	}


}