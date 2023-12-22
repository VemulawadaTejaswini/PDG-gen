import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		char[] initial = new char[N];
		long m = 0; long a = 0; long r = 0; long c = 0; long h = 0;

		for(int i=0; i<N; i++) {
			S[i] = sc.next();
			initial[i] = S[i].charAt(0);
			if(initial[i] == 'M') m++;
			else if(initial[i] == 'A') a++;
			else if(initial[i] == 'R') r++;
			else if(initial[i] == 'C') c++;
			else if(initial[i] == 'H') h++;
		}
			long ans =  m*a*r+m*a*c+m*a*h
					+m*r*c+m*r*h+m*c*h
					+a*r*c+a*r*h+a*c*h
					+r*c*h;

			System.out.println(ans);
	}

}
