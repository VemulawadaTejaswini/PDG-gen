import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		if((N & 1) == 1)System.out.println("No");
		else if(S.subSequence(0, (N / 2)).equals(S.subSequence((N / 2), N)))System.out.println("Yes");
		else System.out.println("No");
	}
}