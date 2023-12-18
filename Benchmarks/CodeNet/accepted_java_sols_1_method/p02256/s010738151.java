
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int in1 = Integer.parseInt(scanner.next()), in2 = Integer.parseInt(scanner.next());
		scanner.close();
		int x = (in1>in2)? in2: in1;
		int y = (in2==x)? in1%in2: in2%in1;

		int init = y;
		if(y==0) init = x;
		for(int i=init; i>0; i--) {
			if(x%i==0 && y%i==0) {
				System.out.println(i);
				break;
			}
		}

	}

}

