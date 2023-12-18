import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] a = {1, 2, 5, 7, 9, 11, 15, 19, 21, 23, 25};
		for(int i = 0; i < n; i++) {
			String[] s = sc.nextLine().split(" ");
			int l = s.length;
			String[] k = new String[l];
			boolean flag = false;
			loop: for(int m : a) {
				for(int j = 0; j < 26; j++) {
					for(int o = 0; o < l; o++) {
						k[o] = afin(s[o], m, j);
						if(check(k[o])) {
							flag = true;
						}
					}
					if(flag) {
						for(int o = 0; o < l; o++) {
							if(o != l - 1) {
								System.out.print(k[o] +" ");
							}else {
								System.out.println(k[o]);
							}
						}
						break loop;
					}
				}
			}
		}
		sc.close();
	}
	static String afin(String s, int a, int b) {
		int l = s.length();
		String ret = "";
		for(int i = 0; i < l; i++) {
			char c = s.charAt(i);
			int t = (c - 'a') * a + b;
			t %= 26;
			char c1 = (char)(t + 'a');
			ret += c1;
		}
		return ret;
	}
	static boolean check(String s) {
		if(s.equals("that") || s.equals("this")){
			return true;
		}else {
			return false;
		}
	}
}
