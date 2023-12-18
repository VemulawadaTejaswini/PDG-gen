import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String S=sc.next();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<S.length();i++) {
			Character c=S.charAt(i);
			map.put(c,0);
		}
		if(map.size()==2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
