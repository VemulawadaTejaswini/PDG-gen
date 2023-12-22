import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    	ACBC146V.B();
    }
}

class ACBC146V {
	static Scanner sc = new Scanner(System.in);

	static void B() {
		int rot = sc.nextInt();
		String s = sc.next();
		StringBuilder out = new StringBuilder();
		for(char c : s.toCharArray()) {
			int pos = ((c - 'A') + rot) % 26;
			out.append((char)('A' + pos));
		}
		System.out.println(out);
	}
}