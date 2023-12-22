import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] intArray = new int[num];
		int k = 0;
		int res = 0;
		while (sc.hasNext()) {
			intArray[k] = sc.nextInt(); 
            k++;
		}

		boolean exist_odd = false;

		while (true) {
			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i] % 2 != 0)
					exist_odd = true;
		}

			if (exist_odd) {
				break;
			}

			for (int i = 0; i < intArray.length; i++) {
				intArray[i] /= 2;
			}

			res++;
		}
		System.out.println(res);
	}
}
