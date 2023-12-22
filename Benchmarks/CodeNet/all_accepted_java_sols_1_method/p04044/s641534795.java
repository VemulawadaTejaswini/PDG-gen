import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt();
		String[] S = new String[a];
		String output = "";
		for (int i = 0;  i < a; i++ ) S[i] = scan.next();
		Arrays.sort(S);
		for (int i = 0;  i < a; i++ ) System.out.print(S[i]);
	}
}