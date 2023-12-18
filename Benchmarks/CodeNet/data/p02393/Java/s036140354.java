import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] numb = str.split(" ");
		
		int a = Integer.parseInt(numb[0]);
		int b = Integer.parseInt(numb[1]);
		int c = Integer.parseInt(numb[2]);
		
		int num[] = {a, b, c};
		
		Arrays.sort(num);
		
		System.out.println(num[0] + " " + num[1] + " " + num[2]);
	}
}