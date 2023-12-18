import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] s = new String[h][w];
		String[] alf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
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