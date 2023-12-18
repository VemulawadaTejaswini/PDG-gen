import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String snake;
		bf.readLine();
		while ((snake = bf.readLine()) != null) {
			String ans = isSnakeA(snake) ? "A" : isSnakeB(snake) ? "B" : "NA";
			System.out.println(ans);
		}
	}

	private static boolean isSnakeA(String snake) {
		String sa = "^>'(=+)#\\1~$";
		Pattern pa = Pattern.compile(sa);
		Matcher ma = pa.matcher(snake);
		return ma.matches();
	}

	private static boolean isSnakeB(String snake) {
		String sb = "^>\\^(Q=)+~~$";
		Pattern pb = Pattern.compile(sb);
		Matcher mb = pb.matcher(snake);
		return mb.matches();
	}
}