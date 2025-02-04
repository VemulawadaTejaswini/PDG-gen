import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.valueOf(sc.nextLine());
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		int[] resultArray = new int[count];
		int indexForward = 0;
		int indexBackward = array.length -1 ;
		for (int j = array.length - 1; j >= 0; j -= 2) {
			resultArray[indexForward++] = array[j];
		}
		for (int j = array.length - 2; j >= 0; j -= 2) {
			resultArray[indexBackward--] = array[j];
		}
 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(resultArray[i]);
			if (i != count - 1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}