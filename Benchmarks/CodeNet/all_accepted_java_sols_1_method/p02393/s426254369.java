import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String[] three = sc.nextLine().split(" ");
		int n1 = Integer.parseInt(three[0]);
		int n2 = Integer.parseInt(three[1]);
		int n3 = Integer.parseInt(three[2]);

		int[] nArray = {n1, n2, n3,};

		java.util.Arrays.sort(nArray);

		System.out.println(nArray[0] + " " + nArray[1] + " " + nArray[2]);
	}

}