import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());

		String value[] = inputed.split("[\\s]+");
		//int intInputed = Integer.parseInt(inputed);

		int first  = Integer.parseInt(value[0]);
		int second = Integer.parseInt(value[1]);
		int third  = Integer.parseInt(value[2]);

		int[] intvalue = new int[3];
		intvalue[0] = first;
		intvalue[1] = second;
		intvalue[2] = third;

		intvalue = sort(intvalue, 0, 1);
		intvalue = sort(intvalue, 1, 2);
		intvalue = sort(intvalue, 0, 1);

		System.out.println(intvalue[0] + " " + intvalue[1] + " " + intvalue[2]);




	}
	public static int[] sort(int[] array, int number, int number2) {
		if (array[number] > array[number2]) {
			int pos1 = array[number];
			int pos2 = array[number2];

			array[number]  = pos2;
			array[number2] = pos1;
		}

			return array;


	}
}