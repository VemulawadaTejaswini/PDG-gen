import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int max , middle , min , tmp;
		Scanner scan = new Scanner(System.in);
		tmp = scan.nextInt();
		max = middle = min = tmp;
		tmp = scan.nextInt();
		if (tmp > max) {
			max = tmp;
		}else if (tmp > middle) {
			middle = tmp;
		}else {
			min = tmp;
		}
		tmp = scan.nextInt();
		if (tmp > max) {
			max = tmp;
		}else if (tmp > middle) {
			middle = tmp;
		}else {
			min = tmp;
		}
		System.out.println(min + " " + middle + " " + max);
	}
}