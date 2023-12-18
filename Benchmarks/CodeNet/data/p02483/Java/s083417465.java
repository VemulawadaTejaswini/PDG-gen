import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] in = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int[] ary = {Integer.parseInt(in[0]), Integer.parseInt(in[1]), Integer.parseInt(in[2])};
		Arrays.sort(ary);
		System.out.println(ary[0] + " " + ary[1] + " " + ary[2]);
	}
}