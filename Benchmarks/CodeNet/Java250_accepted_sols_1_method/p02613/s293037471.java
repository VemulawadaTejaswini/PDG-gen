import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String[] ans = new String[N];
		int c0 = 0, c1 = 0, c2 = 0, c3 = 0;

		for(int i=0;i<N;i++) {
			ans[i] = stdIn.next();
		}

		for(int i=0;i<N;i++) {
			if(ans[i].equals("AC")) {
				c0++;
			}else if(ans[i].equals("WA")) {
				c1++;
			}else if(ans[i].equals("TLE")) {
				c2++;
			}else if(ans[i].equals("RE")) {
				c3++;
			}
		}

		System.out.println("AC x " + c0);
		System.out.println("WA x " + c1);
		System.out.println("TLE x " + c2);
		System.out.println("RE x " + c3);

		stdIn.close();
	}

}
