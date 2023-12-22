import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i=0;
		while(i<1000){
		String line = sc.nextLine();
		String[] array = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[2]);
		String c = array[1];

		int result = 0;

		if (c.equals("?")) {
			break;
		} else if (c.equals("+")) {
			result = a + b;
		} else if (c.equals("-")) {
			result = a - b;
		} else if (c.equals("*")) {
			result = a * b;
		} else if (c.equals("/")) {
			result = a / b;
		}
		System.out.println(result);
		i++;
		}
	}

}