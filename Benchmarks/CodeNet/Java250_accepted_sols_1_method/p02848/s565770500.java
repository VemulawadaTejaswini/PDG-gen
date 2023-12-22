import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[] model = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		String[] mozi = scan.next().split("");

		for(String s: mozi) {
			for(int i=0;i<model.length;i++) {

				if(s.equals(model[i])) {
					int index = n + i;
					System.out.print(model[index%26]);
				}
			}
		}

		scan.close();

	}

}
