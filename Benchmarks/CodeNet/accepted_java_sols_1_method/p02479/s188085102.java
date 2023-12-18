public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double r = scan.nextDouble();
		System.out.println(String.format("%5f" , r * r * 3.141592653589) + " " + String.format("%05f" , 2 * r * 3.141592653589));

	}

}