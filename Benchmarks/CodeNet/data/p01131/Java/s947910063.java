import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			char[][] keitai = {
					{},
					{'.', ',', '!', '?', ' '},
					{'a', 'b', 'c'},
					{'d', 'e', 'f'},
					{'g', 'h', 'i'},
					{'j', 'k', 'l'},
					{'m', 'n', 'o'},
					{'p', 'q', 'r', 's'},
					{'t', 'u', 'v'},
					{'w', 'x', 'y', 'z'}
			};
			
			int n = sc.nextInt();
			while(n-- != 0) {
				char[] b = sc.next().toCharArray();
				StringBuilder s = new StringBuilder();
				int i = 0;
				while(i < b.length) {
					if(b[i] == '0') i++;
					else {
						char c = b[i++];
						int j = 0;
						while(b[i] == c) {
							i++;
							j++;
						}
						s.append(keitai[c - '0'][j % keitai[c - '0'].length]);
						i++;
					}
				}
				System.out.println(s);
			}
		}
	}
}

