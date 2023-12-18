import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for (int i = 0; i < n; i++) {
			double[] xy = new double[8];
			for (int j = 0; j < 8; j++) {
				xy[j] = stdIn.nextDouble();
			}
			double m = (xy[2] - xy[0]) * (xy[7] - xy[5]) - (xy[3] - xy[1]) * (xy[6] - xy[4]);
			if(m==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}