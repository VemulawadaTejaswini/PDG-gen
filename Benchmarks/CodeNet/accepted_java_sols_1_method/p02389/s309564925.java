import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int area = x * y;
		int Circum = x * 2 + y * 2; 
		System.out.println(area + " " + Circum);
		
	}
}