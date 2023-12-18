import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>
		(Arrays.asList("a","b","c","d","e","f","g"
				,"h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
		String str = sc.next();
		int n = list.indexOf(str);
		System.out.println(list.get(n+1));
	}
}