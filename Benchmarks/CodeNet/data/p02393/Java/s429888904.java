import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] argv){
		Scanner in = new Scanner(System.in);
		System.out.println( IntStream.rangeClosed(1, 3).mapToObj(i->in.nextInt()).sorted().map(i->""+i).collect(Collectors.joining(" ")));
	}
}