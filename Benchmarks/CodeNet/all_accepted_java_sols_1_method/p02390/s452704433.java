import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input_number = Integer.parseInt(scan.next());
    int h = (input_number / 3600);
    int m = (input_number / 60 % 60);
    int s = (input_number % 60);
    System.out.println(h + ":" + m + ":" + s);
	}
}

