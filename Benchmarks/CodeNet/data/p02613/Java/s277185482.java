import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int A = 0;
		 int W = 0;
		 int T = 0;
		 int R = 0;
		 for(int i =0; i < N; i++) {
			 String S = sc.next();
			 if(S.equals("AC")) {
				 A++;
			 }
			 else if(S.equals("WA")) {
				 W++;
			 }
			 else if(S.equals("TLE")) {
				 T++;
			 }
			 else if(S.equals("RE")) {
				 R++;
			 }
		 }
		 System.out.println("AC × " + A);
		 System.out.println("WA × " + W);
		 System.out.println("TLE × " + T);
		 System.out.println("RE × " + R);
		 sc.close();
	}
}

