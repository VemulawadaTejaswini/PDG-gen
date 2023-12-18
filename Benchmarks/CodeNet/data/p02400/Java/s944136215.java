import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double s = (r*2) * Math.PI;
		double b = (r*r) * Math.PI;
		System.out.printf("%.6f %.6f\n",b,s);
		}
	  }
