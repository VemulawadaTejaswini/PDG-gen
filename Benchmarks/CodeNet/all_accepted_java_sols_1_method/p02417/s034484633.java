import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = "";
		while(sc.hasNext()) {
			String str = sc.nextLine();
			line += str;
		}

		int[] count = new int[26];
		for(int i=0;i<26;i++) {
			count[i] = 0;
		}

		for(int i = 0; i < line.length(); i++) {
			char current = line.charAt(i);
			if(current >= 'a' && current <= 'z') {
				int index = (int) current - 97;
				count[index]++;
			} else if(current >= 'A' && current <= 'Z') {
				int index = (int) current - 65;
				count[index]++;
			}
		}

		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + " : " + count[(int)c - 97]);
		}

		sc.close();
	}

}

