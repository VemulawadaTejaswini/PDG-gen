import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNextLine()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			if(x == 0 && y == 0) {
				break;
			}

			if(x >= 0  && x <= 10000) {
				if(x > y) {
					int tmp = x;
					x = y;
					y = tmp;
				}
				System.out.println(x + " " +y);
			}
		}

    	scanner.close();
    }
}

