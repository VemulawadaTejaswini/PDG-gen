import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		StringBuffer nsb = new StringBuffer(N);
		String N_reverse = nsb.reverse().toString();

		if (N.equals(N_reverse)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
    }

}