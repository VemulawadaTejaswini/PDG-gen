import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sec = stdIn.nextInt();

		int h, m;

		h = sec / (60 * 60);
		sec %= (60 * 60);

		m = sec / 60;
		sec %= 60;

		System.out.println(h + ":" + m + ":" + sec);
	}

}