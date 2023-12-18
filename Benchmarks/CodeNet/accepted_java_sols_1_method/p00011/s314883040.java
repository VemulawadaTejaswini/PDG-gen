import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\\s*,\\s*|\\n");
		
		int VirticalLines = scan.nextInt();
		int hoirizontalLines = scan.nextInt();

		int[] lineNumber = new int[VirticalLines + 1];
		for(int i = 1; i <= VirticalLines; i++) lineNumber[i] = i;

		for(int i = 0; i < hoirizontalLines; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int tmp = lineNumber[a];
			lineNumber[a] = lineNumber[b];
			lineNumber[b] = tmp;
		}
		
		for(int i = 1; i <= VirticalLines; i++) System.out.println(lineNumber[i]);
	}
}