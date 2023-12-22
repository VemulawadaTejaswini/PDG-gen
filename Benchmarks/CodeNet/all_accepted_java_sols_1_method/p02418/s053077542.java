import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String DNA, RNA;
		try (Scanner sc = new Scanner(System.in)) {
			DNA = sc.nextLine();
			RNA = sc.nextLine();
			DNA = DNA + DNA;
			if(DNA.indexOf(RNA) == -1) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			
		}
	}
}
