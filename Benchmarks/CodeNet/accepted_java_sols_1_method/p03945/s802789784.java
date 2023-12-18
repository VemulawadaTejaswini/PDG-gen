import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] S = scanner.next().toCharArray();
		int n = S.length;
		int count = 0;
		char pre = S[0];
		for(int i=1;i<n;i++) {
			if(pre != S[i]) count++;
			pre = S[i];
		}
		System.out.println(count);
		scanner.close();
	}

}
