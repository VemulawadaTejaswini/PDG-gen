import java.util.Scanner;

class  Main {
	public static void main(String[] args) {
		
	     for (int i = 0; i < 200; i++) {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int add = add(a,b);
			
			int keta = Integer.toString(add).length();
			System.out.println(keta);
		}
	}
	public static int add(int a, int b) {
		return a + b;
	}
}