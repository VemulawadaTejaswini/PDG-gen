import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		int l = str.length();
		if (l <= 1) {
			System.out.println(str);
			return;
		}
		
		List<Long> strList = 
				Stream
					.of(str.split(""))
					.map(s -> Long.parseLong(s))
					.collect(Collectors.toList());
		
		int gaps = l - 1;
		
		Long result = 0L;
		
		for (int bit = 0; bit < (1 << gaps); bit++) {
			ArrayList<Long> digits = new ArrayList<Long>(); 
			Long temp = strList.get(0);
			for (int i = 0; i < gaps; i ++) {
				if((bit & (1 << i)) != 0) {
					digits.add(temp);
					if (i < strList.size()) {
						temp = strList.get(i + 1);
					} else {
						temp = null;
					}
				} else {
					temp = 10 * temp + strList.get(i+1);
				}
			}
			if (temp != null) digits.add(temp);
			result += digits.stream().mapToLong(v -> v).sum();
		}
		System.out.println(result);
	}

}