import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String[] sarr = s.split("");

		boolean isReached = false;
		int posA = 0;
		int posZ = 0;

		for (int i = 0; i < sarr.length; i++) {

			if(!isReached) {
				if(sarr[i].equals("A")) {
					posA = i - 1;
					isReached = true;
				}
				continue;
			}
			if(sarr[i].equals("Z")) {
				posZ = i;
			}
		}

		System.out.println(posZ - posA);

	}

}
