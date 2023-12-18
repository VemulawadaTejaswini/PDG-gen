import java.util.Scanner;


class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(1 <= a && b <= 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10){
			int d = a / b;
			int r = a % b;
			
			float A = (int)a;
			float B = (int)b;

			float f = A / B;
			
			
			System.out.println(d + " " + r + " " + f);
		}
	}

}