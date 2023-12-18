import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] info=sc.nextLine().split(" ");
		Integer n=Integer.valueOf(info[0]);
		Integer k=Integer.valueOf(info[1]);
		List<Character> line=Arrays.asList(sc.nextLine().split(""))
				.stream().map(s->s.charAt(0)).collect(Collectors.toList());
		int happy=0;
		for(int i=0;i<n-1;i++) {
			if(line.get(i)==line.get(i+1)) {
				happy++;
			}
		}
		System.out.println(Integer.min(happy+2*k, n-1));
	}
}