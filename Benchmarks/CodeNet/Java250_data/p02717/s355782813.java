import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int[] array = new int[3];
		Scanner input = new Scanner(System.in);
		array[0] = input.nextInt();
		array[1] = input.nextInt();
		array[2] = input.nextInt();
		int num = 0;
		num = array[2];
		array[2] = array[1];
		array[1] = array[0];
		array[0] = num;
		
		for(int i =0;i < array.length; i++) {
			System.out.print(array[i] + " ");	
		}
	}
}