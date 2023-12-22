public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int h = 0;
		int m = 0;
		int s = 0;

		s = sc.nextInt();

		h = s / 3600;
		s = s % 3600;
		m = s / 60;
		s = s % 60;

		System.out.println(h + ":" +  m  + ":" + s);
	}

}