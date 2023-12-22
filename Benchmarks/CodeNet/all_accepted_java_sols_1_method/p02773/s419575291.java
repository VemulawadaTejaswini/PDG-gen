import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Stream.generate(sc::next)
		.limit(n)
		.collect(Collectors.groupingBy(Function.identity(),
                                       Collectors.counting()))
		.entrySet().stream()
		.collect(Collectors.groupingBy(Map.Entry::getValue))
		.entrySet().stream()
		.max(Map.Entry.comparingByKey())
		.map(Map.Entry::getValue)
		.get()
		.stream()
		.map(Map.Entry::getKey)
		.sorted()
		.forEach(System.out::println);
	}
}