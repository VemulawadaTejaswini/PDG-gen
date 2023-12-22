import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while(sc.hasNext()) {
			output = output + sc.next().substring(0, 1);
		}
		System.out.println(output);
		sc.close();
	}
}