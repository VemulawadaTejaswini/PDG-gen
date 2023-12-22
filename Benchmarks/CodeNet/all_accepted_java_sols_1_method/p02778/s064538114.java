import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word_after = sc.next().replaceAll("[0-9a-z]", "x");
		System.out.println(word_after);
    }
}