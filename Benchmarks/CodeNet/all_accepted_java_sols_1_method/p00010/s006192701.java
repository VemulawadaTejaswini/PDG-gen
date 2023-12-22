import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		for(int i = 0;i < n;i++){
			double s[] = new double[6];
			for(int j=0;j < 6;j++){
				s[j] = Double.parseDouble(scan.next());
			}
			double A1,B1,C1,A2,B2,C2,X,Y,R;
			A1 = 2*(s[2] - s[0]);
			B1 = 2*(s[3] - s[1]);
			C1 = Math.pow(s[0], 2) - Math.pow(s[2], 2) + Math.pow(s[1], 2) - Math.pow(s[3], 2);
			A2 = 2*(s[4] - s[0]);
			B2 = 2*(s[5] - s[1]);
			C2 = Math.pow(s[0], 2) - Math.pow(s[4], 2) + Math.pow(s[1], 2) - Math.pow(s[5], 2);
			X = (B1*C2 - B2*C1) / (A1*B2 - A2*B1);
			Y = (C1*A2 - C2*A1) / (A1*B2 - A2*B1);
			R = Math.sqrt(Math.pow(X - s[0], 2) + Math.pow(Y - s[1], 2));
			System.out.printf("%1.3f %1.3f %1.3f%n",X,Y,R);
		}
		System.exit(0);

	}
}