import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int num[] = new int[26];
		int c;

		for (int i = 0; i < num.length; i++){
			num[i] = 0;
		}

		while (sc.hasNextLine()){
			s = sc.nextLine();

			for (int i = 0; i < s.length(); i++){
				c = (int)s.charAt(i);

				if (c >= 'a' && c <= 'z'){
					c -= 'a';
				}else if (c >= 'A' && c <= 'Z'){
					c -= 'A';
				}else{
					continue;
				}

				num[c]++;
			}
		}

		for (int i = 0; i < num.length; i++){
			System.out.println("" + (char)('a' + i) + " : " + num[i]);
		}
	}
}