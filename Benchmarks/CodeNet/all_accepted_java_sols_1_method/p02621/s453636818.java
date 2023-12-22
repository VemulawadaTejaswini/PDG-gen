import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		long ans = (long) (a + Math.pow(a, 2) + Math.pow(a, 3));
		System.out.println(ans);

	}

}
