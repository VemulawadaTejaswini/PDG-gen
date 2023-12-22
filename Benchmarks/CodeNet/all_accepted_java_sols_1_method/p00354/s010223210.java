import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = (x - 9) % 7;
		if(y < 0) {
			y += 7;
		}
		
		switch(y) {
		case 0:
			System.out.println("sat");
			break;
		case 1:
			System.out.println("sun");
			break;
		case 2:
			System.out.println("mon");
			break;
		case 3:
			System.out.println("tue");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thu");
			break;
		case 6:
			System.out.println("fri");
		}
	}
}
