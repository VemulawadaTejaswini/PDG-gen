import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] sArray = br.readLine().split(" ");
			int h = Integer.parseInt(sArray[0]);
			int w = Integer.parseInt(sArray[1]);
			if (h == 0 & w == 0) {
				break;
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}