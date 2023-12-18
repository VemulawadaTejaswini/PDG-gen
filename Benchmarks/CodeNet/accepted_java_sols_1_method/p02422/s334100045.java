import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chars  = sc.nextLine().toCharArray();
		int count = Integer.parseInt(sc.nextLine());
		for(int i = 0;i < count;i++ ) {
			String[] lines = sc.nextLine().split(" ");
			int num1 = Integer.parseInt(lines[1]);
			int num2 = Integer.parseInt(lines[2]);

			if(lines[0].equals("replace")) {
				char[] rep = lines[3].toCharArray();
				int repCount = 0;
				for(int j = num1;j <= num2;j++) {
					chars[j] = rep[repCount];
					repCount++;
				}

			} else if(lines[0].equals("reverse")){
				char[] rev = new char[num2 - num1 + 1];
				int revCount = 0;
				for(int j = num2;j >= num1;j--) {
					rev[revCount] = chars[j];
					revCount++;
				}
				revCount = 0;
				for(int j = num1;j <= num2;j++) {
					chars[j] = rev[revCount];
					revCount++;

				}

			} else if(lines[0].equals("print")) {
				for(int j = num1;j <= num2; j++) {
					System.out.print(chars[j]);
				}
				System.out.println();

			}


		}
		sc.close();

	}
}