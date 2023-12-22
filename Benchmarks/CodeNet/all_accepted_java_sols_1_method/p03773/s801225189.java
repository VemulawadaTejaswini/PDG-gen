import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startTime =sc.nextInt()+sc.nextInt();
		if(startTime > 23) {
			System.out.println(startTime -24);
		}else {
			System.out.println(startTime);
		}

	}
}

