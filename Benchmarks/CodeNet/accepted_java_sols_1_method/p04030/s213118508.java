import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		ArrayDeque<Character> deque=new ArrayDeque<>();
		for(char c:s.next().toCharArray()) {
			if(c=='B')
				deque.pollLast();
			else
				deque.add(c);
		}
		System.out.println(Arrays.toString(deque.toArray()).replaceAll("[^01]",""));
	}
}