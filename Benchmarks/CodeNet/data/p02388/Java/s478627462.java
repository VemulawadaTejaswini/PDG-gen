import java.io.*;
 
class Keyinput {
	public static void main (String[ ] args) throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine();
		int x = Integer.parseInt(str);
		System.out.println(x^3);
	}
}