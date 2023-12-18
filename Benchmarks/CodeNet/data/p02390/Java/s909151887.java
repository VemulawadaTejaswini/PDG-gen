public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int S = sc.nextInt();
			int h = S / 3600;
			S = S - h * 3600;
			int m =  S / 60;
			int s = S - m * 60;
			System.out.println(h + ":" + m + ":" + s) ;
		}
	}
}
