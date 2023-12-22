import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			String line = in.readLine();
			int len = line.length(); // 8
			int halfLen = len / 2;	 // 4
			int count = 0;

// 0123456
// abcdabc : 7
// 0, 6: a, c, 1
// 1, 5: b, b, 1
// 2, 3: c, a, 2

for (int i = 0; i < halfLen; ++i) {
	if (line.charAt(i) != line.charAt(len - i - 1)) {
		count += 1;
}
}
System.out.println(count);
		}
	}

}
