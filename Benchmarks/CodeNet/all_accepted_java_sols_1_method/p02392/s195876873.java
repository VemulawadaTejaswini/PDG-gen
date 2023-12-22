import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int param1 = sc.nextInt();
		int param2 = sc.nextInt();
		int param3 = sc.nextInt();

		String ret = "No";
		if(param1 < param2) {
			if(param2 < param3) {
				ret = "Yes";
			}
		}
		System.out.println(ret);
		sc.close();

	}

}
