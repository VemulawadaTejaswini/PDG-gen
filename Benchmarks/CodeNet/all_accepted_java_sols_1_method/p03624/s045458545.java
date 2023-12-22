import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> s = new ArrayList<String>(Arrays.asList(sc.next().split("")));
		char ans = 'a';
		while (s.indexOf(String.valueOf(ans)) != -1)
			ans++;
		System.out.println((ans <= 'z')? ans : "None");
	}
}