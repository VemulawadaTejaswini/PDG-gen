import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] sa =  S.toCharArray();
		System.out.println((sa[0] == sa[1] && sa[1] == sa[2] || sa[1] == sa[2] &&sa [2] == sa[3] ) ? "Yes" : "No");


//		int cnt = 0;
//		char c = 'a';
//
//		for (char s : S.toCharArray()){
//			if (s == c){
//				cnt++;
//			}else {
//				cnt = 0;
//			}
//
//			if (cnt >= 2){
//				System.out.println("Yes");
//				return;
//			}
//			c = s;
//		}
//		System.out.println("No");
//		return;
	}
}
