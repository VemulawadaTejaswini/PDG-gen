public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt(); 
		int area = a * b;
		int around = 2 * a + 2 * b;
		System.out.println(area +" "+ around);
	}

}