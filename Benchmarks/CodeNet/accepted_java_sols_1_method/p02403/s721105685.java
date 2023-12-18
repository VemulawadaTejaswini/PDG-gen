import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		for (; ;) {
			// for()の中身は使わないなら；；だけでいい
			try {
				input = br.readLine();
				} catch (IOException e) {
				}
			String[] inputs = input.split(" ");
			int H = Integer.parseInt(inputs[0]);
			int W = Integer.parseInt(inputs[1]);
			for (int i = 1; i <= H; i++) {
				for(int j = 1; j <= W; j++) {
					if(j < W) {
						System.out.print("#");
						// printlnは改行して表示。printは横並びに書いていく
					}else {
						System.out.println("#");
						}
					}
				}
			if (H == 0 && W == 0) {
				break;
			}
			System.out.println();
		}
		}	
	}
