import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String[] a = IntStream.range(0, sc.nextInt()/*n*/).map(x->sc.nextInt()).distinct().mapToObj(String::valueOf).toArray(String[]::new);
			System.out.println(String.join(" ", a));
		}
	}
}

