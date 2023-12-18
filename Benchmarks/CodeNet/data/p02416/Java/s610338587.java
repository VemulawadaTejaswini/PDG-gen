import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	while (scan.hasNext()) {
	    int number = scan.nextInt();
	    if (number == 0) {
		break;
	    }
	    System.out.println(sum(number));
	}
    }
    public static int sum (int number) {
	int sum = 0;
	while (number > 0) {
	    sum += number % 10;
	    number /= 10;
	}
	return sum;
    }
}