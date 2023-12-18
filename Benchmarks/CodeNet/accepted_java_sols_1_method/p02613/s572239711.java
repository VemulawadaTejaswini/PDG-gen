import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N =sc.nextInt();
			int count = 0;
			int count2 = 0;
			int count3= 0;
			int count4 = 0;
          String A = "AC";
          String B = "WA";
          String C = "TLE";
          String D = "RE";
		for(int i = 0;i < N;i++) {
			String H = sc.next();
			if(H.equals(A)) {
				count++;
			}
			else if(H.equals(B)) {
				count2++;
			}
			else if(H.equals(C)) {
				count3++;
			}
			else if(H.equals(D)) {
				count4++;
			}
		}
		System.out.println("AC  x  " + count);
		System.out.println("WA  x  " + count2);
		System.out.println("TLE  x  " + count3);
		System.out.println("RE  x  " + count4);
	}
}
