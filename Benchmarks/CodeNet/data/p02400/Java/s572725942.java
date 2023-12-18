import java.util.Scanner;
class Main{
	public void Germany() {
		Scanner sc = new Scanner(System.in);
		double r,men,syu;
		double ens = 3.141592653589;
		r = sc.nextDouble();
		men = ens * (r * r);
		syu = 2 * ens * r;
		System.out.printf("%2.6f %2.6f",men,syu);
	}
	    public static void main(String[] args) {
	        new Main().Germany();
	    }
	}