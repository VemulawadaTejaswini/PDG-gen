import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		System.out.println(IntStream.of(s.nextInt(),s.nextInt(),s.nextInt()).distinct().count());
	}
}