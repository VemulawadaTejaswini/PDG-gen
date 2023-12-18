package atcoder;
//
import java.util.Scanner;
//
public class Main {
//
	public static void main(String[] args) {
//
		char[] chara = new char[26];
		Scanner scan = new Scanner(System.in);
//
		chara[0] = ('a');
		chara[1] = ('b');
		chara[2] = ('c');
		chara[3] = ('d');
		chara[4] = ('e');
		chara[5] = ('f');
		chara[6] = ('g');
		chara[7] = ('h');
		chara[8] = ('i');
		chara[9] = ('j');
		chara[10] = ('k');
		chara[11] = ('l');
		chara[12] = ('m');
		chara[13] = ('n');
		chara[14] = ('o');
		chara[15] = ('p');
		chara[16] = ('q');
		chara[17] = ('r');
		chara[18] = ('s');
		chara[19] = ('t');
		chara[20] = ('u');
		chara[21] = ('v');
		chara[22] = ('w');
		chara[23] = ('x');
		chara[24] = ('y');
		chara[25] = ('z');

		long max = scan.nextLong();

//		long num = max % 26;
//		long num2 = max / 26;
		long num = 0;
		long num2 = max - 1;

		String str = null;
		while(true) {
			num =num2 % 26;
			num2 /= 26;

			str += chara[(int)num];

			if(num2 == 0) {
				System.out.println(str.substring(4));
				scan.close();
				return;
			}
		}
    }
}