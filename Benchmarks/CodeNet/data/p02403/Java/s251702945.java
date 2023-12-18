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
                    for (int i = 1; i <= h; i++) {
                        String result = "";
                        for (int j = 1; j <= w; j++) {
                            result += "#";
                        }
                        output.add(result);
                    }
                    output.add("");
				}
			}
		}
		for (String out : output) {
            System.out.println(out);
        }


	}

}