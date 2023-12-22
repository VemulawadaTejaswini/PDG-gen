import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		int N = s.length;
		int ap=0,tp=0;
		for(int i=0; i<N;i++) {
			if(s[i]=='p') tp++;
		}
		if(N%2==0) ap=N/2;
		else ap = (N-1)/2;
		System.out.println(ap-tp);
		scanner.close();
	}

}
