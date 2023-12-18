import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in),1);
		int[] arrays = new int[10];
		String str = br.readLine();
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = Integer.parseInt(str);
			str = br.readLine();
		}
		Arrays.sort(arrays);
		for (int i = 1; i <= 3; i++) {
			System.out.println(arrays[arrays.length - i]);
		}
	}
		
}