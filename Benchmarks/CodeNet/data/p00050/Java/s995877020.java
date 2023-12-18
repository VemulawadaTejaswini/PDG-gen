package AOJ0050;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = br.readLine()) != null) {
			if(input.isEmpty()) break;
			String[] split = input.split(" ");
			for(int i=0; i<split.length; i++) {
				char[] chr = split[i].toCharArray();
				if(chr[0] == 'p') {
					if(chr[1] == 'e') {
						if(chr[2] == 'a') {
							if(chr[3] == 'c') {
								if(chr[4] == 'h') {
									if(split[i].length() == 6) split[i] = "apple.";
									else split[i] = "apple";
								}
							}
						}
					}
				}
				if(chr[0] == 'a') {
					if(chr[1] == 'p') {
						if(chr[2] == 'p') {
							if(chr[3] == 'l') {
								if(chr[4] == 'e') {
									if(split[i].length() == 6) split[i] = "peach.";
									else split[i] = "peach";
								}
							}
						}
					}
				}
			}
			for(int i=0; i<split.length; i++) {
				if(i != 0) System.out.print(" ");
				System.out.print(split[i]);
			}
			System.out.println("");
		}
	}
}