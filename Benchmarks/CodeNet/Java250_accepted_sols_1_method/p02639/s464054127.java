import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int solution = 0;
		int i = 0;
		while(scanner.hasNext()) {
			if(scanner.nextInt() == 0)
				solution = i + 1;
			i++;
		}
		System.out.print(solution);
		
	}
}
