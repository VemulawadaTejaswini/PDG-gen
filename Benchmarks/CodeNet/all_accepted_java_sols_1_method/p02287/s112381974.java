import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		int[] arr = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < arr.length; i++) {
			String output = "node "+(i+1)+": key = "+arr[i]+", ";
			if (i > 0) {
				output += "parent key = "+(arr[(i+1)/2-1])+", ";
			}
			if ((i+1)*2-1 < arr.length) {
				output += "left key = "+(arr[(i+1)*2-1])+", ";
			}
			if ((i+1)*2 < arr.length) {
				output += "right key = "+(arr[(i+1)*2])+", ";
			}
			System.out.println(output);
		}
	}
}

