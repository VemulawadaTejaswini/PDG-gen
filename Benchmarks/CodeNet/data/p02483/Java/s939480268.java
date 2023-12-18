import java.io.*;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] line_arr = line.split(" ");
		int[] arr = new int[3];
		for (int i = 0; i < line_arr.length; i++) {
			arr[i] = Integer.parseInt(line_arr[i]);
		}
		java.util.Arrays.sort(arr);
		System.out.print(arr[0]);
		System.out.print(' ');
		System.out.print(arr[1]);
		System.out.print(' ');
		System.out.println(arr[2]);
	}

}