import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		int a = Integer.parseInt(s);
		System.out.print(a/3600+":");
		int b = a % 3600;
		System.out.print(b/60+":");
		System.out.println(b%60);
		
	}

}