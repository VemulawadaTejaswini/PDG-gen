import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		HashMap <String, String> Hashy = new HashMap<String, String>();
		Hashy.put("A", "T");
		Hashy.put("T", "A");
		Hashy.put("G", "C");
		Hashy.put("C", "G");
		String S = sc.next();
		System.out.println(Hashy.get(S));
	}

}
