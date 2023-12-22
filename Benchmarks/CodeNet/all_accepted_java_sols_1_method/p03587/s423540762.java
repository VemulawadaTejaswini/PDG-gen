import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String x = in.next();

	char[] charArray = x.toCharArray();

	int cnt = 0;

	for (char ch : charArray) {
		if(ch == '1'){
			cnt++;
		}
	}
	System.out.print(cnt);

	}
}