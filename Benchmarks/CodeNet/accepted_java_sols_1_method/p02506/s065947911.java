import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String W = br.readLine(), T;
		int n = 0;
		while (!"END_OF_TEXT".equals(T = br.readLine())) 	for (String s : T.split(" ")) if (W.equalsIgnoreCase(s)) n++;
		System.out.println(n);
	}
}