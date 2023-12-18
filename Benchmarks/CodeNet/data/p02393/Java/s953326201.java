import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Integer[] s = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(s);
		System.out.printf("%d %d %d\n", s[0], s[1], s[2]);
	}
}


