import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		char[] Alphabet = new char[26];
		Scanner sc = new Scanner(System.in);
		String buf = sc.nextLine();
		sc.close();
		char moji = buf.charAt(0);
		Alphabet[0] = 'a';
		Alphabet[1] = 'b';
		Alphabet[2] = 'c';
		Alphabet[3] = 'd';
		Alphabet[4] = 'e';
		Alphabet[5] = 'f';
		Alphabet[6] = 'g';
		Alphabet[7] = 'h';
		Alphabet[8] = 'i';
		Alphabet[9] = 'j';
		Alphabet[10] = 'k';
		Alphabet[11] = 'l';
		Alphabet[12] = 'm';
		Alphabet[13] = 'n';
		Alphabet[14] = 'o';
		Alphabet[15] = 'p';
		Alphabet[16] = 'q';
		Alphabet[17] = 'r';
		Alphabet[18] = 's';
		Alphabet[19] = 't';
		Alphabet[20] = 'u';
		Alphabet[21] = 'v';
		Alphabet[22] = 'w';
		Alphabet[23] = 'x';
		Alphabet[24] = 'y';
		Alphabet[25] = 'z';
		int i = 0;
		while(Alphabet[i] != moji) {
			i++;
		}
		System.out.print(Alphabet[i+1]);
	}
}