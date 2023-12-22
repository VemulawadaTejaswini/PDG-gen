import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] in = sc.nextLine().split(" ");
		
		if(in[0].equals(in[1])) {
			System.out.println("Yes");
		}else System.out.println("No");
	}
}