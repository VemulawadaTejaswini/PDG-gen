import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.nextLine();
			String []n = s.split(" ");
			double[] v = new double[6];
			for(int i = 0; i < 6; i++) {
				v[i] = Double.parseDouble(n[i]);
			}
			double d = v[0] * v[4] - v[1] * v[3];
			double x = v[4] * v[2] - v[1] * v[5];
			double y = -v[3] * v[2] + v[0] * v[5];
			x /= d;
			y /= d;
			if(x==0)x=0;
            if(y==0)y=0;
			System.out.printf("%.3f %.3f\n", x, y);
		}
		sc.close();
	}
}
