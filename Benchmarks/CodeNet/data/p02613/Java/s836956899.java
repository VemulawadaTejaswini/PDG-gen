
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] a = new String[N];
		for(int i = 0; i < N; i++)
			a[i] = sc.next();
		
		int ac = 0;
		int wa = 0;
		int tle = 0;

		for(int i = 0; i < N; i++) {
			if(a[i] == "AC")
				++ac;
			if(a[i] == "WA")
				++wa;
			if(a[i] == "TLE")
				++tle;
		}
		
		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + (N - ac - wa - tle));
		
	}

}
