import java.util.Scanner;

/**
 * 172 Beginner
 * B:Minor Change
 */
public class Main {
	public static void main(String[] args){
		// input
		java.util.Scanner inData = new Scanner(System.in);

		String s = inData.nextLine();
		String t = inData.nextLine();

		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!s.substring(i,i+1).equals(t.substring(i, i+1)))  cnt++;
		}

		System.out.println(cnt);

		inData.close();

	}
}
