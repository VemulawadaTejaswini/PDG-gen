import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int n = sc.nextInt();
		String[] s = new String[n];
		
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			if (!(list.contains(s[i]))) {
				list.add(s[i]);
			}
		}
		
		if (list.size() == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}
		
	
	}
		
}
	
	
