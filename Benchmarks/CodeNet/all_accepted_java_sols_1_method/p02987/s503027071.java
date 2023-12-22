import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] array = a.toCharArray();
		int count = 0;
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}
		}
		if(count == 2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}