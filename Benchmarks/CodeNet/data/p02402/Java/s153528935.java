public class Main {
	public static void main(String[] args) {

		int number = 5;
		int[] a1 = new int[number];

		a1[0] = 10;
		a1[1] = 1;
		a1[2] = 5;
		a1[3] = 4;
		a1[4] = 17;

		int max = a1[0];
		int min = a1[1];
		int total = 0;

		System.out.println(number);
		for (int i = 0; i < 5; i++) {
			int q = a1[i];
			System.out.print(q+" ");
			if (q > max) {
				max = q;

			}
			if (q < min) {
				min = q;

			}
			total+=q;
			
		}

		System.out.println();
		System.out.println(min);
		System.out.println(max);
		System.out.println(total);
		
	}
}