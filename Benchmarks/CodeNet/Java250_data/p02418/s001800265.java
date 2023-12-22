import java.util.Scanner;

public class Main {
	
	void run() {
		Scanner scan = new Scanner(System.in);
		char[] array1 = scan.next().toCharArray();
		char[] array2 = scan.next().toCharArray();
		outside : for(int i = 0; i < array1.length; i++) {
			if(array1[i] == array2[0]) {
				for(int j = 1; j < array2.length; j++) {
					int tmp = i+j >= array1.length ? i+j-array1.length : i+j;
					if(array2[j] != array1[tmp]) continue outside;
				}
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
