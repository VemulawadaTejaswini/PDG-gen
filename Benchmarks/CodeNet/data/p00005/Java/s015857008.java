import java.util.Scanner;

class Main {
	public static void main(String[] args){

		Scanner cin = new Scanner(System.in);
		int a;
		int b;
		int g;
		
		while (cin.hasNext()){
			a = cin.nextInt();
			b = cin.nextInt();
			g = GCD(a, b);
			System.out.println(g + " " + a * (b / g));
		}
	}
	
	private static int GCD (int a, int b){
		if (a % b != 0){
			return (GCD(b, a % b));
		}
		else {
			return (b);
		}
	}
}