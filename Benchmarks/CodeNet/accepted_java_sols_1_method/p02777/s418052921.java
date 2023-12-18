import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String Smozi = scan.next();
		String Tmozi = scan.next();
		int Aball = scan.nextInt();
		int Bball = scan.nextInt();
		String Umozi = scan.next();

		if(Smozi.equals(Umozi)) {
			Aball -= 1;
		}else if(Tmozi.equals(Umozi)) {
			Bball -= 1;
		}

		System.out.println(Aball+ " "+Bball);
		scan.close();

	}

}
