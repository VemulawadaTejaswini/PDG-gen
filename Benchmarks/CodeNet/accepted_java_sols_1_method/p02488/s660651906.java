import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int numOfData = 0;
		try {
			numOfData = stdin.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String[] words = new String[numOfData];
		try {
			for (int i = 0; i < numOfData; ++i)
				words[i] = stdin.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		stdin.close();
		
		String result = words[0];
		for (int i = 1; i < numOfData; ++i) {
			if (result.compareTo(words[i]) > 0)
				result = words[i];
		}
		System.out.println(result);
	}
}