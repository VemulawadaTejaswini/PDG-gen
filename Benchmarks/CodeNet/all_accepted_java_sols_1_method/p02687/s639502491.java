import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		Map<String, String> map = new HashMap<String, String>();

		map.put("ABC", "ARC");

		map.put("ARC", "ABC");

		if(map.containsKey(a)) {



		System.out.println(map.get(a));

	}
	else {

		System.out.println("もう一度やり直して下さい");
	}
}
}