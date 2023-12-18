import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<ArrayDeque<Character>> list = new ArrayList<ArrayDeque<Character>>(n);
		while (0 < n--) list.add(new ArrayDeque<Character>());
		String line = null;
		while (!"quit".equals(line = br.readLine())) {
			String[] in = line.split(" ");
			if (line.startsWith("pop")) System.out.println(list.get(Integer.parseInt(in[1])-1).pop());
			else if (line.startsWith("push")) list.get(Integer.parseInt(in[1])-1).push(in[2].charAt(0));
			else list.get(Integer.parseInt(in[2])-1).push(list.get(Integer.parseInt(in[1])-1).pop());
		}
	}
}