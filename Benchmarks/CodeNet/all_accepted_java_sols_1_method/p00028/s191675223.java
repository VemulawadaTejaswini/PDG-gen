import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[100];
		while(true) {
			String s = r.readLine();
			if(s == null) break;
			arr[Integer.valueOf(s) - 1]++;
		}
		int max = 0;
		for(int a : arr) {
			max = Math.max(a, max);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				list.add(i + 1);
			}
		}
		Collections.sort(list);
		for(int l : list) {
			System.out.println(l);
		}
	}
}