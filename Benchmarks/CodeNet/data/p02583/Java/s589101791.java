import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int length = reader.nextInt(), count = 0;
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = reader.nextInt();
		}
		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				if (arr[i] == arr[j]) {
					continue;
				}
				for (int k = j + 1; k < length; k++) {
					if (arr[i] == arr[k] || arr[j] == arr[k]) {
						continue;
					}
					if (arr[i] + arr[j] <= arr[k] || arr[i] + arr[k] <= arr[j] || arr[j] + arr[k] <= arr[i]) {
						continue;
					}
					else {
						//System.out.println("ijk: " + i + " " + j + " " + k);
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
		reader.close();
	}
	
}
