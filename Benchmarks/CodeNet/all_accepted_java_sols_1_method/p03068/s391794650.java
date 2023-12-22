import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		String  word = s.next();
		int num = s.nextInt();
		ArrayList <Character> array = new ArrayList<>();

 		for(int i = 0;i < length;i++) {
			if(word.charAt(i) == word.charAt(num-1)){
				array.add(word.charAt(num-1));
			}else array.add('*');
		}
 		for(Character c:array)
 			System.out.printf("%c",c);
 		s.close();

	}

}