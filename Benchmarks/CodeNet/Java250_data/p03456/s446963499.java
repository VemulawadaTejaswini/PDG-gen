import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();
		String str = String.valueOf(a) + String.valueOf(b);
		int num = Integer.valueOf(str);

		double check = Math.sqrt(num);

		if(check == Math.floor(check)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}