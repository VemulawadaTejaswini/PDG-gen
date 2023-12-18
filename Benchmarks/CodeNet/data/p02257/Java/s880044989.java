import java.util.Scanner;
public class Main{

private static Scanner scanner;

public static void main(String args[])
{
	scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int[] b = new int[a];
	int count = 0,pre = 0;
	for(int i = 0;i < a;i++) {
		b[i] = scanner.nextInt();

	}
	for(int i = 0;i < a;i++) {
		for(int j = 2;j < b[i] && j < 100000000;j++) {
			if(b[i]%j == 0) {
				count++;
			}
		}
		if(count == 0) {
			pre++;
		}
		count = 0;
		}
	System.out.println(pre);
}
}
