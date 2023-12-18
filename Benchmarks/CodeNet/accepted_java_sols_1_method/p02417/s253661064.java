import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] chars = new int[256];
		for (int i = 0; i < 256; i ++) chars[i] = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			for (int i = 0; i < line.length(); i ++) {
				char ch = Character.toLowerCase(line.charAt(i));
				if (ch >= 'a' && ch <= 'z') chars[ch] ++;
			}
		}
		for (char ch = 'a'; ch <= 'z'; ch ++) System.out.println(ch + " : " + chars[ch]);	
	}
}