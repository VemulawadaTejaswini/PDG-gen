import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = Integer.parseInt(stdIn.nextLine());
		while(n-->0){
			System.out.println(stdIn.nextLine().replace("Hoshino", "Hoshina"));
		}
	}
}