import java.util.Scanner;
public class Main{

private static Scanner scanner;

public static void main(String args[])
{
	scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int[] b = new int[a];
	for(int i = 0;i < a;i++) {
		b[i] = scanner.nextInt();

	}
	for(int i = 0;i < a;i++) {
		int v = b[i];
		int j = i-1;
		while(j >= 0 && b[j] > v) {
			b[j+1] = b[j];
			j--;
			b[j+1] = v;
		}
		for(int c = 0;c < a;c++)
		{
			System.out.print(b[c]);
			if(c == a-1) {}
			else {
			System.out.print(" ");
			}
		}
		System.out.println("");
		}

	}
}

