public class Main {

	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int S = scn.nextInt();
		System.out.print(S/3600 + ":" + (S%3600)/60 + ":" + (S%3600)%60);
		scn.close();
	}
}
