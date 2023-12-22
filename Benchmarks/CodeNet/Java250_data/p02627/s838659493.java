import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String aa = "abcdefghijklmnopqrstuvwxyz";
		if(aa.indexOf(a) < 0) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}



	}
}
