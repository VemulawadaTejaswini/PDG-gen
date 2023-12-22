import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		char [][]a = new char[H][W];
		String []k = new String[H];
		for(int i = 0; i < H; i++) {
			String s = scan.next();
			k[i] = s;
			for(int j = 0; j < W; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		scan.close();

		List<String> list = new ArrayList<String>();
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				char c = k[i].charAt(j);
				if(c == '#') {
					list.add(k[i]);
					break;
				}
			}
		}
		int h = list.size();
		char [][]b = new char[h][W];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < W; j++) {
				b[i][j] = list.get(i).charAt(j);
			}
		}
		List<String> list2 = new ArrayList<String>();
		for(int j = 0; j < W; j++) {
			for(int i = 0; i < h; i++) {
				if(b[i][j] == '#') {
					String d = "";
					for(int m = 0; m < h; m++) {
						d += b[m][j];
					}
					list2.add(d);
					break;
				}
			}
		}
		char [][]e = new char[h][list2.size()];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < list2.size(); j++) {
				e[i][j] = list2.get(j).charAt(i);
			}
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < list2.size(); j++) {
				System.out.print(e[i][j]);
			}
			System.out.println();
		}

	}
}