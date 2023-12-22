import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] s = new String[h][w];
		String[] alf = new String[26];
		for(char c = 'A' ; c <= 'Z' ; c++) alf[(int)(c - 'A')] = String.valueOf(c);
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				s[i][j] = sc.next();
			}
		}
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(s[i][j].equals("snuke")) {
					System.out.println(alf[j] + (i + 1));
				}
			}
		}
	}
}