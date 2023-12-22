import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.close();

		String num = Integer.toString(n);
		String[] line = num.split("");
		for(int i = 0; i < num.length(); i++) {
			if(line[i].equals("1")) {
				 System.out.print("9");
            } else {
              System.out.print("1");
			}
		}

	}
}