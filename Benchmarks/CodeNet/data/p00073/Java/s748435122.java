import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			while (true) {
				int x = sc.nextInt();
				int h = sc.nextInt();
				
					if (x == 0 && h == 0) { 
						break;
					}
				double S = surface_area_pyra(x, h);
				System.out.println(S);
			}
		sc.close();

	}

	private static double surface_area_pyra(int x, int h) {
		double x_2 = Math.pow(x, 2);
		double h_2 = Math.pow(h, 2);
		
		double S = x * Math.sqrt(4 * h_2 + x_2) + x_2;
		
		return S;
	}

}

