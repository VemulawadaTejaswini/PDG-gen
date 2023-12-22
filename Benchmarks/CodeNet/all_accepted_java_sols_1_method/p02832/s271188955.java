import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int current_number = 1;
		for (int i = 0; i < n; i++) {
			int current_value = Integer.parseInt(arr[i]);
			if (current_number == current_value) {
				current_number++;
			}
		}
		if (current_number == 1) System.out.println(-1);
		else System.out.println(n - (current_number - 1));
	}
}
