import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input_number  = Integer.parseInt(scan.next());
    int input_number2 = Integer.parseInt(scan.next());
    if (input_number > input_number2) {
      System.out.println("a > b");
    } else if (input_number == input_number2) {
      System.out.println("a == b");
    } else {
      System.out.println("a < b");
    }
	}
}

