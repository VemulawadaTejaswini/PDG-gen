import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		for (int turtle = 0; turtle <= x; turtle++) {
		    if (turtle * 4 + (x - turtle) * 2 == y) {
		        System.out.println("Yes");
		        return;
		    }
		}
	    System.out.println("No");
	}
}
