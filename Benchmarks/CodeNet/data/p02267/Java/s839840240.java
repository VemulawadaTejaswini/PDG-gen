import java.util.Scanner;

public class Main {
	public static int linearSearch(int[] input, int[] toFind) {
		int result = 0;
		
		for (int i = 0; i < toFind.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (toFind[i] == input[j]) {
					result++;
					break;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input;
		int[] searchFor;
		int numInput;
		int numSearchFor;
		
		numInput = scanner.nextInt();
		input = new int[numInput];
		for (int i = 0; i < numInput; i++) {
			input[i] = scanner.nextInt();
		}
		
		numSearchFor = scanner.nextInt();
		searchFor = new int[numSearchFor];
		for (int i = 0; i < numSearchFor; i++) {
			searchFor[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println(linearSearch(input, searchFor));
	}
}

