import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short size, sum;
		while (true) {
			short ze = 0, on = 0, tw = 0, th = 0, fo = 0, fi = 0, si = 0, se = 0, ei = 0, ni = 0;
			sum = 0;
			String input = in.readLine();
			if (input.equals("0")) {
				break;
			}
			size = (short) input.length();
			for (int i = 0; i < size; i += 1) {
				if (Character.toString(input.charAt(i)).equals("0")) {
					ze++;
				} else if (Character.toString(input.charAt(i)).equals("1")) {
					on++;
				} else if (Character.toString(input.charAt(i)).equals("2")) {
					tw++;
				} else if (Character.toString(input.charAt(i)).equals("3")) {
					th++;
				} else if (Character.toString(input.charAt(i)).equals("4")) {
					fo++;
				} else if (Character.toString(input.charAt(i)).equals("5")) {
					fi++;
				} else if (Character.toString(input.charAt(i)).equals("6")) {
					si++;
				} else if (Character.toString(input.charAt(i)).equals("7")) {
					se++;
				} else if (Character.toString(input.charAt(i)).equals("8")) {
					ei++;
				} else if (Character.toString(input.charAt(i)).equals("9")) {
					ni++;
				}
				sum = (short) (0 * ze + 1 * on + 2 * tw + 3 * th + 4 * fo + 5
						* fi + 6 * si + 7 * se + 8 * ei + 9 * ni);
			}
			System.out.println(sum);
		}
	}
}