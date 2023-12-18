import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrayCnt = new Integer(s.nextLine()).intValue();
		int[] array = new int[arrayCnt];
		String[] tmpArray = s.nextLine().split(" ");
		for(int i=0 ; i<array.length ; i++) {
			array[i] = new Integer(tmpArray[i]).intValue();
		}
		String result = partition(array);
		System.out.println(result);
	}

	public static String partition(int[] array) {
		int index = 0;
		for(int i=0 ; i<array.length-1 ; i++) {
			if(array[i] <= array[array.length-1]) {
				int tmp = array[index];
				array[index] = array[i];
				array[i] = tmp;
				index++;
			}else {

			}
		}
		int tmp = array[index];
		array[index] = array[array.length - 1];
		array[array.length - 1] = tmp;
		StringBuilder b = new StringBuilder();
		for(int i=0 ; i<array.length ; i++) {
			if(index == i)
				b.append("[").append(array[i]).append("] ");
			else
				b.append(array[i]).append(" ");
		}
		return b.toString().trim();
	}
}