import java.util.Scanner;

public class Main {
	public static final char[][] button = {
		{'.',',','!','?',' '},
		{'a','b','c'},
		{'d','e','f'},
		{'g','h','i'},
		{'j','k','l'},
		{'m','n','o'},
		{'p','q','r','s'},
		{'t','u','v'},
		{'w','x','y','z'},
		};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			char[] s = sc.next().toCharArray();
			StringBuilder ans = new StringBuilder();
			int a = 0,b = -1;
			for(int j=0;j<s.length;j++) {
				if (s[j] == '0') {
					if (a != 0) {
						ans.append(button[a-1][b]);
					}
					a = 0;
					b = -1;
				}else{
					a = s[j] - '0';
					b = (b + 1) % button[a-1].length;
				}
			}
			System.out.println(ans.toString());
		}
	}

}