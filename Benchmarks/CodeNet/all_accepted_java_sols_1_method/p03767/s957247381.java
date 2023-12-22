import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer n=Integer.valueOf(sc.nextLine());
		List<Long> member=Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(Long::valueOf)
				.sorted(Comparator.reverseOrder())
				.limit(n*2)
				.collect(Collectors.toList());
		Long result=0l;
		for(int i=0;i<n;i++) {
			result+=member.get(2*i+1);
		}
		System.out.println(result);
	}
}