import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		for(int i = 0; i < 3; i++) {
			sb.append(sc.next().substring(0, 1));
		}

		System.out.println(sb);
	}

}