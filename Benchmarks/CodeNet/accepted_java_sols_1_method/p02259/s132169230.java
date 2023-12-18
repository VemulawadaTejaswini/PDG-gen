import java.util.Scanner;
public class Main{
private static Scanner scanner;
public static void main(String args[]) {
	scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int[] b = new int[a];
	int count = 0;
	//int flag = 1;
	for(int i = 0;i < a;i++) {
		b[i] = scanner.nextInt();
	}
	for(int i = 0;i < a;i++) {
			for(int j = a-1;j >= 1;j--) {
				if(b[j] < b[j-1]) {
					int tmp = b[j];
					b[j] = b[j-1];
					b[j-1] = tmp;
					count++;
			}
		}
	}
	for(int i = 0;i < a;i++) {
		System.out.print(b[i]);
		if(i == a - 1) {
			System.out.println("");
		}else {
			System.out.print(" ");
		}
	}
	System.out.println(count);
}
}

