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
			int n = sc.nextInt();
			List<Integer> a =  IntStream.range(0, n).mapToObj(x->sc.nextInt()).collect(Collectors.toList());
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				int cmd = sc.nextInt();
				int b = sc.nextInt();
				int e = sc.nextInt();
				if(cmd == 0) {
					System.out.println(Collections.min(a.subList(b, e)));
				}
				else {
					System.out.println(Collections.max(a.subList(b, e)));
				}
			}	
		}
	}

}

