import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		String[] info=sc.nextLine().split(" ");
		BigDecimal t=new BigDecimal(info[0]);
		BigDecimal a=new BigDecimal(info[1]);

		List<BigDecimal> input=Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(s->new BigDecimal(s)
						.multiply(new BigDecimal("-0.006"))
						.add(t)
						.subtract(a)
						.abs())
				.collect(Collectors.toList());
		System.out.println(input.indexOf(Collections.min(input))+1);
	}
}