import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for ( int i = 1; !sc.hasNext("0"); i++ )
			System.out.println("Case "+i+": "+sc.nextInt());
	}
}