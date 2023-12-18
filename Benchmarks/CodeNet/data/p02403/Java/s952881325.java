import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		List<String> output = new ArrayList<String>();

		while (stdin.hasNext()) {
			String input = stdin.nextLine();
			String[] inputs = input.split(" ");
			int h = Integer.parseInt(inputs[0]);
			int w = Integer.parseInt(inputs[1]);
			if (h == 0 && w == 0) {
				break;
			} else {
				if (h >= 1 && h <= 300 && w >= 1 && w <= 300) {
					StringBuilder sb = new StringBuilder();
					sb.append(h);
					sb.append(" ");
					sb.append(w);
					String temp = sb.toString();
					output.add(temp);
				}
			}
		}
		for (String i : output) {
			String all[] = i.split(" ");
			int h = Integer.parseInt(all[0]);
			int w = Integer.parseInt(all[1]);
			for (int height = 1; height <= h; height++) {
				for (int width = 1; width <= w; width++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}

	}

}