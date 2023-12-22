import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		sc.close();

		ArrayList<Integer> AList = new ArrayList<>();
		ArrayList<Integer> ZList = new ArrayList<>();

		for(int i = 0; i < words.length(); i++) {
			char character = words.charAt(i);

			if(character == 'A') {
				AList.add(i);
			}else if(character == 'Z') {
				ZList.add(i);
			}
		}

		int aa = AList.get(0);
		int zz = ZList.get(ZList.size()-1);

		System.out.println(zz-aa+1);

	}

}
