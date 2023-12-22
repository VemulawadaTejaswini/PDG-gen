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
    	ACBC146V.A();
    }
}

class ACBC146V {
	static Scanner sc = new Scanner(System.in);
	static void A() {
		String s = sc.next();
		final String[] WEEK = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for (int i = 0; i < WEEK.length; i++) {
			if(WEEK[i].equals(s)) {
				System.out.println(7 - i);
			}
		}
	}
}