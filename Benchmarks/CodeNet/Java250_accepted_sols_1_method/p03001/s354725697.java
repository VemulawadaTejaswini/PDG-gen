import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double W = sc.nextDouble();
		double H = sc.nextDouble();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		String s = "";
		if(x == W/2 && y == H/2) {
			s = "1";
		}else {
			s = "0";
		}
		
		double face = W*H/2;
		
		System.out.println(face + " " + s);
		
		sc.close();
	}

}