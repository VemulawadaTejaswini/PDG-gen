public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int first, second, third, temp;

		first = sc.nextInt(); // i=0

		temp = sc.nextInt(); // i=1
		if (temp > first) {
			second = first;
			first = temp;
		} else {
			second = temp;
		}

		temp = sc.nextInt(); // i=2
		if (temp > first) {
			third = second;
			second = first;
			first = temp;
		} else if (temp > second) {
			third = second;
			second = temp;
		} else {
			third = temp;
		}

		for (int i=3; i < 10; i++) {
			temp = sc.nextInt();
			if (temp > first) {
				third = second;
				second = first;
				first = temp;
			} else if (temp > second) {
				third = second;
				second = temp;
			} else if (temp > third) {
				third = temp;
			}
		}

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

}